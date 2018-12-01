package me.sumithpuri.github.sikkim.spring.ws.xfire.sample;

import javax.jws.WebService;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Code Sample			Brainbench Spring 2.5 Certification [+ Spring In Action Samples]
 * Sample Topic			Core Spring (Web Services)
 * Certificate URL		https://goo.gl/X321kd
 * Package Prefix 		me.sumithpuri.github.sikkim
 * Project Codename		sikkim
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
// note that in spring xfire, the configuration through xml takes precedence over below annotation
@WebService(serviceName="stockService", endpointInterface="me.sumithpuri.github.sikkim.spring.ws.xfire.sample.StockTrader")
public class StockTraderImpl implements StockTrader {

	static {
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Sikkim");
		System.out.println("Project Description   Core Spring (Web Services)");
		System.out.println("Certification         Brainbench Spring 2.5 Certification");
		System.out.println("Certificate URL	      https://goo.gl/X321kd");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println("[Developer Notes]     [02] Use Apache Tomcat 9.0+ Compiler");
		System.out.println();
	}
	
	
	public String[] getStockQuotes() {
		
		// TODO Auto-Generated Method Stub
		System.out.println("Stock Quotes Spring Web Service Invoked...");
		
		String[] stocks = new String[] {"POPY 12.50", "DOPY 99.00", "BOBY 44.00", "LOLA 21.25", "KYTE 64.23"};
		return stocks;
	}

}
