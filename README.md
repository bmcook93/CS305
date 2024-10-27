# CS305


    Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
Artemis Financial is a financial consulting company that makes personalized plans for their customers. In order to effectively modernize their software, they wanted to focus on security when it comes to protecting clients personal information. To do this, when data is transferred, it needs to be verified with a checksum.
    
    What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?
Using SHA-256 to verify input adds a layer of integrity to the software. It makes it less susceptible to attacks and vulnerabilities, as checksums values can be compared to determine if the data has been tampered with. Proper software security measures can prevent data leaks, which is of vital importance in the case of Artemis Financial, who handles many customer's financial information.
    
    Which part of the vulnerability assessment was challenging or helpful to you?
Testing that the API and hashing algorithm was working was challenging. I was having issues because I typically use a VPN, and, despite everything appearing to be correct, the software wouldn't run and generate a webpage with the checksum value. It was a simple fix, but an issue I overlooked for some time.
  
    How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
Using one of the most popular, secure algorithms led to better security in the product. Additionally, refactoring code to use try-catch blocks for exception handling prevents the potential for data leaks. This is important, as leaking errors unintentionally can provide information to potential hackers about how the system works.
    
    How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
Carefully inspecting the code after refactoring it helped me to minimize errors. Paying close attentions to warnings in my IDE and at runtime helped me to find other issues as well. The program was fairly simple, but it is important to always review code and check for potential logic errors that automation may miss.
    
    What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
As always, research through Google and coding forums is very helpful. More secure solutions may exist out there that other people have found that you may not have thought of yourself. It's important to keep an open mind when coding, and to keep the requirements of the system in mind.
    
    Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
I would show employers the utilization of a RESTful API and the Spring Framework to create a checksum. I would additionally show them the steps I took to make the program secure and efficient.
