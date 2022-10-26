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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeatureCardToutiao extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_FLOOR;
    public static final List<ThreadInfo> DEFAULT_SUB_NODES;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> sub_nodes;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer floor;
        public List sub_nodes;
        public String title;
        public Integer type;

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
        public Builder(FeatureCardToutiao featureCardToutiao) {
            super(featureCardToutiao);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {featureCardToutiao};
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
            if (featureCardToutiao == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardToutiao.sub_nodes);
            this.type = featureCardToutiao.type;
            this.title = featureCardToutiao.title;
            this.floor = featureCardToutiao.floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardToutiao build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new FeatureCardToutiao(this, z, null);
            }
            return (FeatureCardToutiao) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1066231238, "Ltbclient/FeatureCardToutiao;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1066231238, "Ltbclient/FeatureCardToutiao;");
                return;
            }
        }
        DEFAULT_SUB_NODES = Collections.emptyList();
        DEFAULT_TYPE = 0;
        DEFAULT_FLOOR = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardToutiao(Builder builder, boolean z) {
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
            List list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
                return;
            } else {
                this.floor = num2;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.type = builder.type;
        this.title = builder.title;
        this.floor = builder.floor;
    }

    public /* synthetic */ FeatureCardToutiao(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
