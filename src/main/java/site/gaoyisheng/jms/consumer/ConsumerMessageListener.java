/*
 * file_name: ConsumerMessageListener.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2018年2月24日 下午7:40:15
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package site.gaoyisheng.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author gaoyisheng
 * 消息监听者
 */
public class ConsumerMessageListener implements MessageListener {

	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;

		try {
			System.out.println("接收消息:"+textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
	}

}
