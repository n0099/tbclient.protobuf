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
public final class PopInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final String DEFAULT_AHEAD_URL = "";
    public static final Integer DEFAULT_IF_POP;
    public static final String DEFAULT_OK_INFO = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_V_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer if_pop;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String v_title;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PopInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ahead_info;
        public String ahead_url;
        public Integer if_pop;
        public String ok_info;
        public String title;
        public String v_title;

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
        public Builder(PopInfo popInfo) {
            super(popInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {popInfo};
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
            if (popInfo == null) {
                return;
            }
            this.if_pop = popInfo.if_pop;
            this.title = popInfo.title;
            this.v_title = popInfo.v_title;
            this.ahead_info = popInfo.ahead_info;
            this.ahead_url = popInfo.ahead_url;
            this.ok_info = popInfo.ok_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PopInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PopInfo(this, z, null);
            }
            return (PopInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(906160230, "Ltbclient/PopInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(906160230, "Ltbclient/PopInfo;");
                return;
            }
        }
        DEFAULT_IF_POP = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopInfo(Builder builder, boolean z) {
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
            Integer num = builder.if_pop;
            if (num == null) {
                this.if_pop = DEFAULT_IF_POP;
            } else {
                this.if_pop = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.v_title;
            if (str2 == null) {
                this.v_title = "";
            } else {
                this.v_title = str2;
            }
            String str3 = builder.ahead_info;
            if (str3 == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = str3;
            }
            String str4 = builder.ahead_url;
            if (str4 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str4;
            }
            String str5 = builder.ok_info;
            if (str5 == null) {
                this.ok_info = "";
                return;
            } else {
                this.ok_info = str5;
                return;
            }
        }
        this.if_pop = builder.if_pop;
        this.title = builder.title;
        this.v_title = builder.v_title;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
    }

    public /* synthetic */ PopInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
