package choral.examples.BuyerSellerShipper;
import org.choral.annotations.Choreography;
import org.choral.lang.Unit;
import org.choral.runtime.UI.Panel;
import org.choral.channels.SymChannel_A;

@Choreography( role = "Shipper", name = "BuyerSellerShipper" )
class BuyerSellerShipper_Shipper {
	SymChannel_A < Object > cb;

	BuyerSellerShipper_Shipper( Unit c, SymChannel_A < Object > cb ) {
		this( cb );
	}
	
	BuyerSellerShipper_Shipper( SymChannel_A < Object > cb ) {
		this.cb = cb;
	}

	void run( Unit catalogue, Unit customer ) {
		run();
	}
	
	void run() {
		{
			switch( cb.< EnumBoolean >select( Unit.id ) ){
				default -> {
					throw new RuntimeException( "Received unexpected label from select operation" );
				}
				case True -> {
					{
						switch( cb.< EnumBoolean >select( Unit.id ) ){
							default -> {
								throw new RuntimeException( "Received unexpected label from select operation" );
							}
							case True -> {
								String operation;
								operation = cb.< String >com( Unit.id );
								Panel.show( "Shipper", "Buyer shipped " + operation );
							}
							case False -> {
								
							}
						}
					}
				}
				case False -> {
					
				}
			}
		}
	}

}