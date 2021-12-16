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
/* loaded from: classes5.dex */
public final class PresentMyList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final String DEFAULT_CURRENCY_TYPE = "";
    public static final Integer DEFAULT_CURRENCY_UNIT;
    public static final Integer DEFAULT_GIFT_ID;
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final Integer DEFAULT_NUM;
    public static final Long DEFAULT_PAY_USERID;
    public static final String DEFAULT_PAY_USERNAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_PRESENT_SCORES;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String currency_type;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer currency_unit;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pay_userid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pay_username;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long present_scores;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thumbnail_url;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<PresentMyList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer create_time;
        public String currency_type;
        public Integer currency_unit;
        public Integer gift_id;
        public String gift_name;
        public String name_show;
        public Integer num;
        public Long pay_userid;
        public String pay_username;
        public String play_url;
        public String portrait;
        public Long present_scores;
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
        public Builder(PresentMyList presentMyList) {
            super(presentMyList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {presentMyList};
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
            if (presentMyList == null) {
                return;
            }
            this.pay_userid = presentMyList.pay_userid;
            this.pay_username = presentMyList.pay_username;
            this.portrait = presentMyList.portrait;
            this.gift_id = presentMyList.gift_id;
            this.gift_name = presentMyList.gift_name;
            this.play_url = presentMyList.play_url;
            this.thumbnail_url = presentMyList.thumbnail_url;
            this.create_time = presentMyList.create_time;
            this.num = presentMyList.num;
            this.currency_unit = presentMyList.currency_unit;
            this.currency_type = presentMyList.currency_type;
            this.present_scores = presentMyList.present_scores;
            this.name_show = presentMyList.name_show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentMyList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PresentMyList(this, z, null) : (PresentMyList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1750871872, "Ltbclient/PresentMyList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1750871872, "Ltbclient/PresentMyList;");
                return;
            }
        }
        DEFAULT_PAY_USERID = 0L;
        DEFAULT_GIFT_ID = 0;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_NUM = 0;
        DEFAULT_CURRENCY_UNIT = 0;
        DEFAULT_PRESENT_SCORES = 0L;
    }

    public /* synthetic */ PresentMyList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentMyList(Builder builder, boolean z) {
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
            Long l = builder.pay_userid;
            if (l == null) {
                this.pay_userid = DEFAULT_PAY_USERID;
            } else {
                this.pay_userid = l;
            }
            String str = builder.pay_username;
            if (str == null) {
                this.pay_username = "";
            } else {
                this.pay_username = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str3 = builder.gift_name;
            if (str3 == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str3;
            }
            String str4 = builder.play_url;
            if (str4 == null) {
                this.play_url = "";
            } else {
                this.play_url = str4;
            }
            String str5 = builder.thumbnail_url;
            if (str5 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str5;
            }
            Integer num2 = builder.create_time;
            if (num2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num2;
            }
            Integer num3 = builder.num;
            if (num3 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num3;
            }
            Integer num4 = builder.currency_unit;
            if (num4 == null) {
                this.currency_unit = DEFAULT_CURRENCY_UNIT;
            } else {
                this.currency_unit = num4;
            }
            String str6 = builder.currency_type;
            if (str6 == null) {
                this.currency_type = "";
            } else {
                this.currency_type = str6;
            }
            Long l2 = builder.present_scores;
            if (l2 == null) {
                this.present_scores = DEFAULT_PRESENT_SCORES;
            } else {
                this.present_scores = l2;
            }
            String str7 = builder.name_show;
            if (str7 == null) {
                this.name_show = "";
                return;
            } else {
                this.name_show = str7;
                return;
            }
        }
        this.pay_userid = builder.pay_userid;
        this.pay_username = builder.pay_username;
        this.portrait = builder.portrait;
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.play_url = builder.play_url;
        this.thumbnail_url = builder.thumbnail_url;
        this.create_time = builder.create_time;
        this.num = builder.num;
        this.currency_unit = builder.currency_unit;
        this.currency_type = builder.currency_type;
        this.present_scores = builder.present_scores;
        this.name_show = builder.name_show;
    }
}
