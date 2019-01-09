package utilities;

import org.junit.Assert;
import org.junit.Test;

import utilities.Lesson01.MyNumber;

public class Lesson04 {
	/*
	 * Viết class tên là MyTriangle với các đặc điểm sau - Canh1, Canh2, Canh3 -
	 * Thuộc tính lưu trữ 03 cạnh của tam giác - Phương thức: + boolean IsTriangle()
	 * - Kiểm tra canh1, canh2, canh3 có phải là 03 cạnh của tam giác không? +
	 * boolean IsIsoscelesTriangle() - Kiểm tra xem có phải là 03 cạnh của tam giác
	 * cân hay không? + int GetCircuit() - Tính chu vi nếu là tam giác
	 */
	class MyTriangle {
		// thuộc tính
		public int Canh1;
		int Canh2;
		int Canh3;

		// boolean IsTriangle()
		boolean IsTriangle(int Canh1, int Canh2, int Canh3) {
			if ((Canh1 + Canh2 >= Canh3) && (Canh1 + Canh3 >= Canh2) && (Canh2 + Canh3 >= Canh1)) {
				return true;
			} else
				return false;
		}

		// IsIsoscelesTriangle()
		boolean IsIsoscelesTriangle(int Canh1, int Canh2, int Canh3) {
			if (this.IsTriangle(Canh1, Canh2, Canh3)) {
				if ((Canh1 == Canh2) || (Canh1 == Canh3) || (Canh2 == Canh3)) {
					return true;
				}
				return false;
			}
			return false;
		}

		// int GetCircuit()
		int GetCircuit(int Canh1, int Canh2, int Canh3) {
			if (this.IsTriangle(Canh1, Canh2, Canh3)) {
				return Canh1 + Canh2 + Canh3;
			} else
				return 0;
		}

	}

	// Test
	@Test
	public void Check_IsTriangle() {
		// Arrange
		int Canh1 = 1;
		int Canh2 = 2;
		int Canh3 = 3;
		MyTriangle tamgiac = new MyTriangle();

		// Action
		boolean result = tamgiac.IsTriangle(Canh1, Canh2, Canh3);

		// Assertion
		Assert.assertEquals(true, result);
	}

	@Test
	public void Check_IsIsoscelesTriangle() {
		// Arrange
		int Canh1 = 1;
		int Canh2 = 2;
		int Canh3 = 3;
		MyTriangle tamgiac = new MyTriangle();

		// Action
		boolean result = tamgiac.IsIsoscelesTriangle(Canh1, Canh2, Canh3);

		// Assertion
		Assert.assertEquals(true, result);
	}

	@Test
	public void Check_GetCircuit() {
		// Arrange
		int Canh1 = 1;
		int Canh2 = 2;
		int Canh3 = 3;
		MyTriangle tamgiac = new MyTriangle();

		// Action
		int chuvi = tamgiac.GetCircuit(Canh1, Canh2, Canh3);
		// Assertion
		Assert.assertEquals(6, chuvi);
	}
}
