package proxyTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import proxy.DatabaseProxy;
import proxy.User;

class DatabaseProxyTest {
	DatabaseProxy databaseProxy = new DatabaseProxy(new User("Juan", "123", true));

	@Test
	void TestDeleteDataByProxyIfWorks() {

		databaseProxy.deleteData("data2");
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> databaseProxy.showData("data2"));

	}

	@Test
	void TestModifyDataIfWorks() {
		databaseProxy.modifyData("data2", "newData");
		assertEquals(databaseProxy.showData("newData"), "newData: random content");
	}

}
