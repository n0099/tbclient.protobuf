package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class DisplayWindowInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_INTRO = "";
    public static final Integer DEFAULT_IS_DISPLAY;
    public static final Long DEFAULT_PRODUCT_ID;
    public static final Long DEFAULT_SALES;
    public static final Long DEFAULT_SHIP_FEE;
    public static final Long DEFAULT_STOCK;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_UNIT_PRICE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final DealMedia img;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_display;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long product_id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long sales;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long ship_fee;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long stock;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long unit_price;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DisplayWindowInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public DealMedia img;
        public String intro;
        public Integer is_display;
        public Long product_id;
        public Long sales;
        public Long ship_fee;
        public Long stock;
        public String title;
        public Long unit_price;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DisplayWindowInfo displayWindowInfo) {
            super(displayWindowInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {displayWindowInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (displayWindowInfo == null) {
                return;
            }
            this.product_id = displayWindowInfo.product_id;
            this.title = displayWindowInfo.title;
            this.intro = displayWindowInfo.intro;
            this.img = displayWindowInfo.img;
            this.unit_price = displayWindowInfo.unit_price;
            this.stock = displayWindowInfo.stock;
            this.ship_fee = displayWindowInfo.ship_fee;
            this.is_display = displayWindowInfo.is_display;
            this.sales = displayWindowInfo.sales;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DisplayWindowInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DisplayWindowInfo(this, z, null) : (DisplayWindowInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1328787333, "Ltbclient/DisplayWindowInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1328787333, "Ltbclient/DisplayWindowInfo;");
                return;
            }
        }
        DEFAULT_PRODUCT_ID = 0L;
        DEFAULT_UNIT_PRICE = 0L;
        DEFAULT_STOCK = 0L;
        DEFAULT_SHIP_FEE = 0L;
        DEFAULT_IS_DISPLAY = 0;
        DEFAULT_SALES = 0L;
    }

    public /* synthetic */ DisplayWindowInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayWindowInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.product_id;
            if (l == null) {
                this.product_id = DEFAULT_PRODUCT_ID;
            } else {
                this.product_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.intro;
            if (str2 == null) {
                this.intro = "";
            } else {
                this.intro = str2;
            }
            this.img = builder.img;
            Long l2 = builder.unit_price;
            if (l2 == null) {
                this.unit_price = DEFAULT_UNIT_PRICE;
            } else {
                this.unit_price = l2;
            }
            Long l3 = builder.stock;
            if (l3 == null) {
                this.stock = DEFAULT_STOCK;
            } else {
                this.stock = l3;
            }
            Long l4 = builder.ship_fee;
            if (l4 == null) {
                this.ship_fee = DEFAULT_SHIP_FEE;
            } else {
                this.ship_fee = l4;
            }
            Integer num = builder.is_display;
            if (num == null) {
                this.is_display = DEFAULT_IS_DISPLAY;
            } else {
                this.is_display = num;
            }
            Long l5 = builder.sales;
            if (l5 == null) {
                this.sales = DEFAULT_SALES;
                return;
            } else {
                this.sales = l5;
                return;
            }
        }
        this.product_id = builder.product_id;
        this.title = builder.title;
        this.intro = builder.intro;
        this.img = builder.img;
        this.unit_price = builder.unit_price;
        this.stock = builder.stock;
        this.ship_fee = builder.ship_fee;
        this.is_display = builder.is_display;
        this.sales = builder.sales;
    }
}
