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
/* loaded from: classes10.dex */
public final class SendCardInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CARD_GET_STATUS;
    public static final String DEFAULT_CARD_LOGO = "";
    public static final String DEFAULT_CARD_NAME = "";
    public static final String DEFAULT_CARD_PRO = "";
    public static final Long DEFAULT_PACKET_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer card_get_status;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_logo;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String card_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String card_pro;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long packet_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<SendCardInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer card_get_status;
        public String card_logo;
        public String card_name;
        public String card_pro;
        public Long packet_id;

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
        public Builder(SendCardInfo sendCardInfo) {
            super(sendCardInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {sendCardInfo};
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
            if (sendCardInfo == null) {
                return;
            }
            this.card_logo = sendCardInfo.card_logo;
            this.card_name = sendCardInfo.card_name;
            this.card_pro = sendCardInfo.card_pro;
            this.card_get_status = sendCardInfo.card_get_status;
            this.packet_id = sendCardInfo.packet_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SendCardInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SendCardInfo(this, z, null) : (SendCardInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-534270773, "Ltbclient/SendCardInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-534270773, "Ltbclient/SendCardInfo;");
                return;
            }
        }
        DEFAULT_CARD_GET_STATUS = 0;
        DEFAULT_PACKET_ID = 0L;
    }

    public /* synthetic */ SendCardInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCardInfo(Builder builder, boolean z) {
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
            String str = builder.card_logo;
            if (str == null) {
                this.card_logo = "";
            } else {
                this.card_logo = str;
            }
            String str2 = builder.card_name;
            if (str2 == null) {
                this.card_name = "";
            } else {
                this.card_name = str2;
            }
            String str3 = builder.card_pro;
            if (str3 == null) {
                this.card_pro = "";
            } else {
                this.card_pro = str3;
            }
            Integer num = builder.card_get_status;
            if (num == null) {
                this.card_get_status = DEFAULT_CARD_GET_STATUS;
            } else {
                this.card_get_status = num;
            }
            Long l = builder.packet_id;
            if (l == null) {
                this.packet_id = DEFAULT_PACKET_ID;
                return;
            } else {
                this.packet_id = l;
                return;
            }
        }
        this.card_logo = builder.card_logo;
        this.card_name = builder.card_name;
        this.card_pro = builder.card_pro;
        this.card_get_status = builder.card_get_status;
        this.packet_id = builder.packet_id;
    }
}
