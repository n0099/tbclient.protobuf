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
/* loaded from: classes10.dex */
public final class ManagerElectionTab extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_NEW_STRATEGY;
    public static final Integer DEFAULT_NEW_MANAGER_STATUS;
    public static final String DEFAULT_NEW_STRATEGY_LINK = "";
    public static final String DEFAULT_NEW_STRATEGY_TEXT = "";
    public static final String DEFAULT_TOAST_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_new_strategy;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer new_manager_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String new_strategy_link;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String new_strategy_text;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String toast_text;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ManagerElectionTab> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_new_strategy;
        public Integer new_manager_status;
        public String new_strategy_link;
        public String new_strategy_text;
        public String toast_text;

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
        public Builder(ManagerElectionTab managerElectionTab) {
            super(managerElectionTab);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {managerElectionTab};
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
            if (managerElectionTab == null) {
                return;
            }
            this.is_new_strategy = managerElectionTab.is_new_strategy;
            this.new_strategy_link = managerElectionTab.new_strategy_link;
            this.new_manager_status = managerElectionTab.new_manager_status;
            this.new_strategy_text = managerElectionTab.new_strategy_text;
            this.toast_text = managerElectionTab.toast_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerElectionTab build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ManagerElectionTab(this, z, null) : (ManagerElectionTab) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-909302109, "Ltbclient/GetForumDetail/ManagerElectionTab;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-909302109, "Ltbclient/GetForumDetail/ManagerElectionTab;");
                return;
            }
        }
        DEFAULT_IS_NEW_STRATEGY = 0;
        DEFAULT_NEW_MANAGER_STATUS = 0;
    }

    public /* synthetic */ ManagerElectionTab(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerElectionTab(Builder builder, boolean z) {
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
            Integer num = builder.is_new_strategy;
            if (num == null) {
                this.is_new_strategy = DEFAULT_IS_NEW_STRATEGY;
            } else {
                this.is_new_strategy = num;
            }
            String str = builder.new_strategy_link;
            if (str == null) {
                this.new_strategy_link = "";
            } else {
                this.new_strategy_link = str;
            }
            Integer num2 = builder.new_manager_status;
            if (num2 == null) {
                this.new_manager_status = DEFAULT_NEW_MANAGER_STATUS;
            } else {
                this.new_manager_status = num2;
            }
            String str2 = builder.new_strategy_text;
            if (str2 == null) {
                this.new_strategy_text = "";
            } else {
                this.new_strategy_text = str2;
            }
            String str3 = builder.toast_text;
            if (str3 == null) {
                this.toast_text = "";
                return;
            } else {
                this.toast_text = str3;
                return;
            }
        }
        this.is_new_strategy = builder.is_new_strategy;
        this.new_strategy_link = builder.new_strategy_link;
        this.new_manager_status = builder.new_manager_status;
        this.new_strategy_text = builder.new_strategy_text;
        this.toast_text = builder.toast_text;
    }
}
