package com.example.springSimplilearn.springDevOps;




import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith( SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringDevOpsApplicationTests {

	 @Autowired
	    private MockMvc mockMvc;
	    @Test
	    public void getsAllEmployees() throws Exception {
	        mockMvc.perform(MockMvcRequestBuilders.get("/employee")
	                .accept(MediaType.APPLICATION_JSON))
	                .andExpect(status().isOk())
	                .andReturn();
	    }

	    @Test
	    public void addsNewEmployee() throws Exception {
	        String newEmployee = "{\"empId\":12,\"name\":\"Raji\",\"city\":\"Bangalore\" }";
	        mockMvc.perform(MockMvcRequestBuilders.post("/employee")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(newEmployee)
	                .accept(MediaType.APPLICATION_JSON))
	                .andExpect(status().isOk())
	                .andReturn();
	    }
}
