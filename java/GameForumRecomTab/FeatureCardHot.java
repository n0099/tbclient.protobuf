package tbclient.GameForumRecomTab;

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
import tbclient.FeatureCardHotSubNode;
/* loaded from: classes8.dex */
public final class FeatureCardHot extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_FLOOR;
    public static final List<FeatureCardHotSubNode> DEFAULT_SUB_NODES;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeatureCardHotSubNode> sub_nodes;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FeatureCardHot> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer floor;
        public List<FeatureCardHotSubNode> sub_nodes;
        public String title;
        public String type;

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
        public Builder(FeatureCardHot featureCardHot) {
            super(featureCardHot);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {featureCardHot};
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
            if (featureCardHot == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardHot.sub_nodes);
            this.type = featureCardHot.type;
            this.title = featureCardHot.title;
            this.floor = featureCardHot.floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardHot build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FeatureCardHot(this, z, null) : (FeatureCardHot) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1978441137, "Ltbclient/GameForumRecomTab/FeatureCardHot;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1978441137, "Ltbclient/GameForumRecomTab/FeatureCardHot;");
                return;
            }
        }
        DEFAULT_SUB_NODES = Collections.emptyList();
        DEFAULT_FLOOR = 0;
    }

    public /* synthetic */ FeatureCardHot(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardHot(Builder builder, boolean z) {
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
            List<FeatureCardHotSubNode> list = builder.sub_nodes;
            if (list == null) {
                this.sub_nodes = DEFAULT_SUB_NODES;
            } else {
                this.sub_nodes = Message.immutableCopyOf(list);
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
                return;
            } else {
                this.floor = num;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.type = builder.type;
        this.title = builder.title;
        this.floor = builder.floor;
    }
}