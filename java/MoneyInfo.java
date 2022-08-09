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
/* loaded from: classes9.dex */
public final class MoneyInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DEFAULT;
    public static final String DEFAULT_DISCOUNT = "";
    public static final String DEFAULT_GID = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_MONEY = "";
    public static final String DEFAULT_ORIGINAL_COST = "";
    public static final String DEFAULT_PACKET_TEXT = "";
    public static final String DEFAULT_PAYMENT_POS_KEY = "";
    public static final String DEFAULT_PID = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer _default;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String discount;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String money;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String original_cost;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String packet_text;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String payment_pos_key;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MoneyInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer _default;
        public String discount;
        public String gid;
        public String icon;
        public String money;
        public String original_cost;
        public String packet_text;
        public String payment_pos_key;
        public String pid;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(MoneyInfo moneyInfo) {
            super(moneyInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {moneyInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (moneyInfo == null) {
                return;
            }
            this.icon = moneyInfo.icon;
            this.gid = moneyInfo.gid;
            this.pid = moneyInfo.pid;
            this.title = moneyInfo.title;
            this.money = moneyInfo.money;
            this.discount = moneyInfo.discount;
            this._default = moneyInfo._default;
            this.payment_pos_key = moneyInfo.payment_pos_key;
            this.packet_text = moneyInfo.packet_text;
            this.original_cost = moneyInfo.original_cost;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MoneyInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MoneyInfo(this, z, null) : (MoneyInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-291040041, "Ltbclient/MoneyInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-291040041, "Ltbclient/MoneyInfo;");
                return;
            }
        }
        DEFAULT_DEFAULT = 0;
    }

    public /* synthetic */ MoneyInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.gid;
            if (str2 == null) {
                this.gid = "";
            } else {
                this.gid = str2;
            }
            String str3 = builder.pid;
            if (str3 == null) {
                this.pid = "";
            } else {
                this.pid = str3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            String str5 = builder.money;
            if (str5 == null) {
                this.money = "";
            } else {
                this.money = str5;
            }
            String str6 = builder.discount;
            if (str6 == null) {
                this.discount = "";
            } else {
                this.discount = str6;
            }
            Integer num = builder._default;
            if (num == null) {
                this._default = DEFAULT_DEFAULT;
            } else {
                this._default = num;
            }
            String str7 = builder.payment_pos_key;
            if (str7 == null) {
                this.payment_pos_key = "";
            } else {
                this.payment_pos_key = str7;
            }
            String str8 = builder.packet_text;
            if (str8 == null) {
                this.packet_text = "";
            } else {
                this.packet_text = str8;
            }
            String str9 = builder.original_cost;
            if (str9 == null) {
                this.original_cost = "";
                return;
            } else {
                this.original_cost = str9;
                return;
            }
        }
        this.icon = builder.icon;
        this.gid = builder.gid;
        this.pid = builder.pid;
        this.title = builder.title;
        this.money = builder.money;
        this.discount = builder.discount;
        this._default = builder._default;
        this.payment_pos_key = builder.payment_pos_key;
        this.packet_text = builder.packet_text;
        this.original_cost = builder.original_cost;
    }
}
