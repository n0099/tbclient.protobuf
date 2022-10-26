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
public final class StateInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_ICON_PID;
    public static final Long DEFAULT_ICON_PID_NEW;
    public static final Integer DEFAULT_ICON_TYPE;
    public static final String DEFAULT_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer icon_pid;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long icon_pid_new;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon;
        public Integer icon_pid;
        public Long icon_pid_new;
        public Integer icon_type;
        public String text;

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
        public Builder(StateInfo stateInfo) {
            super(stateInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {stateInfo};
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
            if (stateInfo == null) {
                return;
            }
            this.icon = stateInfo.icon;
            this.text = stateInfo.text;
            this.icon_type = stateInfo.icon_type;
            this.icon_pid = stateInfo.icon_pid;
            this.icon_pid_new = stateInfo.icon_pid_new;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StateInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new StateInfo(this, z, null);
            }
            return (StateInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1050880934, "Ltbclient/StateInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1050880934, "Ltbclient/StateInfo;");
                return;
            }
        }
        DEFAULT_ICON_TYPE = 0;
        DEFAULT_ICON_PID = 0;
        DEFAULT_ICON_PID_NEW = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateInfo(Builder builder, boolean z) {
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
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
            } else {
                this.text = str2;
            }
            Integer num = builder.icon_type;
            if (num == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = num;
            }
            Integer num2 = builder.icon_pid;
            if (num2 == null) {
                this.icon_pid = DEFAULT_ICON_PID;
            } else {
                this.icon_pid = num2;
            }
            Long l = builder.icon_pid_new;
            if (l == null) {
                this.icon_pid_new = DEFAULT_ICON_PID_NEW;
                return;
            } else {
                this.icon_pid_new = l;
                return;
            }
        }
        this.icon = builder.icon;
        this.text = builder.text;
        this.icon_type = builder.icon_type;
        this.icon_pid = builder.icon_pid;
        this.icon_pid_new = builder.icon_pid_new;
    }

    public /* synthetic */ StateInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
