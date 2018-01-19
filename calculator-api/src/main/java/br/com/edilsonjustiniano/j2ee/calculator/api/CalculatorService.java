package br.com.edilsonjustiniano.j2ee.calculator.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculatorService {

	/**
	 * Sum two integer numbers.
	 *
	 * @param first
	 *            The first number.
	 * @param second
	 *            The second number.
	 * @return The resulting sum.
	 */
	@GET
	@Path("/sum/first/{first}/second/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Integer sum(@PathParam("first") Integer first, @PathParam("second") Integer second);

	/**
	 * Subtract two integer numbers.
	 *
	 * @param first
	 *            The first number.
	 * @param second
	 *            The second number.
	 * @return The resulting subtract.
	 */
	@GET
	@Path("/subtract/first/{first}/second/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Integer subtract(@PathParam("first") Integer first, @PathParam("second") Integer second);

	/**
	 * Multiple two integer numbers.
	 *
	 * @param first
	 *            The first number.
	 * @param second
	 *            The second number.
	 * @return The resulting multiple.
	 */
	@GET
	@Path("/multiply/first/{first}/second/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Integer multiple(@PathParam("first") Integer first, @PathParam("second") Integer second);

	/**
	 * Divide two integer numbers.
	 *
	 * @param first
	 *            The first number.
	 * @param second
	 *            The second number.
	 * @return The resulting divide.
	 */
	@GET
	@Path("/divide/first/{first}/second/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Integer divide(@PathParam("first") Integer first, @PathParam("second") Integer second);
}
