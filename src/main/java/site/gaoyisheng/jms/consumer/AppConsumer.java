/*
 * file_name: AppConsumer.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2018年2月24日 下午7:58:39
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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
	}
}
