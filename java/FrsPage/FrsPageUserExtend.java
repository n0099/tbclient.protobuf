package tbclient.FrsPage;

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
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes10.dex */
public final class FrsPageUserExtend extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<User> DEFAULT_DATA;
    public static final String DEFAULT_TIPS = "";
    public static final Integer DEFAULT_USER_EXTEND_STOREY;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<User> data;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_extend_storey;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FrsPageUserExtend> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<User> data;
        public String tips;
        public Integer user_extend_storey;

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
        public Builder(FrsPageUserExtend frsPageUserExtend) {
            super(frsPageUserExtend);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {frsPageUserExtend};
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
            if (frsPageUserExtend == null) {
                return;
            }
            this.user_extend_storey = frsPageUserExtend.user_extend_storey;
            this.tips = frsPageUserExtend.tips;
            this.data = Message.copyOf(frsPageUserExtend.data);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsPageUserExtend build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FrsPageUserExtend(this, z, null) : (FrsPageUserExtend) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2113889987, "Ltbclient/FrsPage/FrsPageUserExtend;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2113889987, "Ltbclient/FrsPage/FrsPageUserExtend;");
                return;
            }
        }
        DEFAULT_USER_EXTEND_STOREY = 0;
        DEFAULT_DATA = Collections.emptyList();
    }

    public /* synthetic */ FrsPageUserExtend(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrsPageUserExtend(Builder builder, boolean z) {
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
            Integer num = builder.user_extend_storey;
            if (num == null) {
                this.user_extend_storey = DEFAULT_USER_EXTEND_STOREY;
            } else {
                this.user_extend_storey = num;
            }
            String str = builder.tips;
            if (str == null) {
                this.tips = "";
            } else {
                this.tips = str;
            }
            List<User> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
                return;
            } else {
                this.data = Message.immutableCopyOf(list);
                return;
            }
        }
        this.user_extend_storey = builder.user_extend_storey;
        this.tips = builder.tips;
        this.data = Message.immutableCopyOf(builder.data);
    }
}
