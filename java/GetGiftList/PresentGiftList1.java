package tbclient.GetGiftList;

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
/* loaded from: classes5.dex */
public final class PresentGiftList1 extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTIVITY_TYPE;
    public static final Integer DEFAULT_BEGIN_TIME;
    public static final Integer DEFAULT_CURRENCY;
    public static final Integer DEFAULT_CURRENCY_UNIT;
    public static final Integer DEFAULT_DISCOUNT;
    public static final Integer DEFAULT_END_TIME;
    public static final Integer DEFAULT_GIFT_COUNT;
    public static final String DEFAULT_GIFT_DESC = "";
    public static final Integer DEFAULT_GIFT_ID;
    public static final String DEFAULT_GIFT_NAME = "";
    public static final Integer DEFAULT_IOS_DISCOUNT;
    public static final Integer DEFAULT_IOS_PRICE;
    public static final String DEFAULT_MARK_URL = "";
    public static final Integer DEFAULT_PITCH_ON;
    public static final Integer DEFAULT_PRICE;
    public static final Integer DEFAULT_PROPORTION;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer activity_type;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer begin_time;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer currency;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer currency_unit;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer discount;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer gift_count;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String gift_desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer ios_discount;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer ios_price;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mark_url;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer pitch_on;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer proportion;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<PresentGiftList1> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer activity_type;
        public Integer begin_time;
        public Integer currency;
        public Integer currency_unit;
        public Integer discount;
        public Integer end_time;
        public Integer gift_count;
        public String gift_desc;
        public Integer gift_id;
        public String gift_name;
        public Integer ios_discount;
        public Integer ios_price;
        public String mark_url;
        public Integer pitch_on;
        public Integer price;
        public Integer proportion;
        public String thumbnail_url;

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
        public Builder(PresentGiftList1 presentGiftList1) {
            super(presentGiftList1);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {presentGiftList1};
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
            if (presentGiftList1 == null) {
                return;
            }
            this.gift_id = presentGiftList1.gift_id;
            this.gift_name = presentGiftList1.gift_name;
            this.price = presentGiftList1.price;
            this.thumbnail_url = presentGiftList1.thumbnail_url;
            this.ios_price = presentGiftList1.ios_price;
            this.gift_desc = presentGiftList1.gift_desc;
            this.activity_type = presentGiftList1.activity_type;
            this.mark_url = presentGiftList1.mark_url;
            this.begin_time = presentGiftList1.begin_time;
            this.end_time = presentGiftList1.end_time;
            this.discount = presentGiftList1.discount;
            this.ios_discount = presentGiftList1.ios_discount;
            this.proportion = presentGiftList1.proportion;
            this.gift_count = presentGiftList1.gift_count;
            this.pitch_on = presentGiftList1.pitch_on;
            this.currency_unit = presentGiftList1.currency_unit;
            this.currency = presentGiftList1.currency;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentGiftList1 build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PresentGiftList1(this, z, null) : (PresentGiftList1) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(44059902, "Ltbclient/GetGiftList/PresentGiftList1;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(44059902, "Ltbclient/GetGiftList/PresentGiftList1;");
                return;
            }
        }
        DEFAULT_GIFT_ID = 0;
        DEFAULT_PRICE = 0;
        DEFAULT_IOS_PRICE = 0;
        DEFAULT_ACTIVITY_TYPE = 0;
        DEFAULT_BEGIN_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_DISCOUNT = 0;
        DEFAULT_IOS_DISCOUNT = 0;
        DEFAULT_PROPORTION = 0;
        DEFAULT_GIFT_COUNT = 0;
        DEFAULT_PITCH_ON = 0;
        DEFAULT_CURRENCY_UNIT = 0;
        DEFAULT_CURRENCY = 0;
    }

    public /* synthetic */ PresentGiftList1(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentGiftList1(Builder builder, boolean z) {
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
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_name;
            if (str == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str;
            }
            Integer num2 = builder.price;
            if (num2 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num2;
            }
            String str2 = builder.thumbnail_url;
            if (str2 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str2;
            }
            Integer num3 = builder.ios_price;
            if (num3 == null) {
                this.ios_price = DEFAULT_IOS_PRICE;
            } else {
                this.ios_price = num3;
            }
            String str3 = builder.gift_desc;
            if (str3 == null) {
                this.gift_desc = "";
            } else {
                this.gift_desc = str3;
            }
            Integer num4 = builder.activity_type;
            if (num4 == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num4;
            }
            String str4 = builder.mark_url;
            if (str4 == null) {
                this.mark_url = "";
            } else {
                this.mark_url = str4;
            }
            Integer num5 = builder.begin_time;
            if (num5 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num5;
            }
            Integer num6 = builder.end_time;
            if (num6 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num6;
            }
            Integer num7 = builder.discount;
            if (num7 == null) {
                this.discount = DEFAULT_DISCOUNT;
            } else {
                this.discount = num7;
            }
            Integer num8 = builder.ios_discount;
            if (num8 == null) {
                this.ios_discount = DEFAULT_IOS_DISCOUNT;
            } else {
                this.ios_discount = num8;
            }
            Integer num9 = builder.proportion;
            if (num9 == null) {
                this.proportion = DEFAULT_PROPORTION;
            } else {
                this.proportion = num9;
            }
            Integer num10 = builder.gift_count;
            if (num10 == null) {
                this.gift_count = DEFAULT_GIFT_COUNT;
            } else {
                this.gift_count = num10;
            }
            Integer num11 = builder.pitch_on;
            if (num11 == null) {
                this.pitch_on = DEFAULT_PITCH_ON;
            } else {
                this.pitch_on = num11;
            }
            Integer num12 = builder.currency_unit;
            if (num12 == null) {
                this.currency_unit = DEFAULT_CURRENCY_UNIT;
            } else {
                this.currency_unit = num12;
            }
            Integer num13 = builder.currency;
            if (num13 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num13;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.price = builder.price;
        this.thumbnail_url = builder.thumbnail_url;
        this.ios_price = builder.ios_price;
        this.gift_desc = builder.gift_desc;
        this.activity_type = builder.activity_type;
        this.mark_url = builder.mark_url;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.discount = builder.discount;
        this.ios_discount = builder.ios_discount;
        this.proportion = builder.proportion;
        this.gift_count = builder.gift_count;
        this.pitch_on = builder.pitch_on;
        this.currency_unit = builder.currency_unit;
        this.currency = builder.currency;
    }
}
