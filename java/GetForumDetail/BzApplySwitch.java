package tbclient.GetForumDetail;

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
public final class BzApplySwitch extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_APPLY_SWITCH;
    public static final String DEFAULT_ASSIST_LINK = "";
    public static final String DEFAULT_MANAGER_LINK = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer apply_switch;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String assist_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String manager_link;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BzApplySwitch> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer apply_switch;
        public String assist_link;
        public String manager_link;

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
        public Builder(BzApplySwitch bzApplySwitch) {
            super(bzApplySwitch);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bzApplySwitch};
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
            if (bzApplySwitch == null) {
                return;
            }
            this.apply_switch = bzApplySwitch.apply_switch;
            this.manager_link = bzApplySwitch.manager_link;
            this.assist_link = bzApplySwitch.assist_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BzApplySwitch build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BzApplySwitch(this, z, null);
            }
            return (BzApplySwitch) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-951126278, "Ltbclient/GetForumDetail/BzApplySwitch;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-951126278, "Ltbclient/GetForumDetail/BzApplySwitch;");
                return;
            }
        }
        DEFAULT_APPLY_SWITCH = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BzApplySwitch(Builder builder, boolean z) {
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
            Integer num = builder.apply_switch;
            if (num == null) {
                this.apply_switch = DEFAULT_APPLY_SWITCH;
            } else {
                this.apply_switch = num;
            }
            String str = builder.manager_link;
            if (str == null) {
                this.manager_link = "";
            } else {
                this.manager_link = str;
            }
            String str2 = builder.assist_link;
            if (str2 == null) {
                this.assist_link = "";
                return;
            } else {
                this.assist_link = str2;
                return;
            }
        }
        this.apply_switch = builder.apply_switch;
        this.manager_link = builder.manager_link;
        this.assist_link = builder.assist_link;
    }

    public /* synthetic */ BzApplySwitch(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
