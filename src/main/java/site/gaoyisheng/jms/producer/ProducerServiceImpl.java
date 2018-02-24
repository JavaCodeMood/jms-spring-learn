/*
 * file_name: ProducerServiceImpl.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2018年2月24日 下午2:54:02
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package site.gaoyisheng.jms.producer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ProducerServiceImpl implements ProducerService {

	@Autowired
	JmsTemplate jmsTemplate;

	//@Resource(name = "queueDestination")
	@Resource(name = "topicDestination")
	Destination destination;

	public void sendMessage(final String message) {
		//使用jmsTemplate发送消息
		jmsTemplate.send(destination, new MessageCreator() {
			//创建一个消息
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMessage = session.createTextMessage(message);
				return textMessage;
			}
		});
		
		System.out.println("发送消息" + message);
		
	}

}
