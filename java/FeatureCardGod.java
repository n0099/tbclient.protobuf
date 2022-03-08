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
public final class FeatureCardGod extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_FLOOR;
    public static final List<User> DEFAULT_SUB_NODES;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> sub_nodes;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeatureCardGod> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer floor;
        public List<User> sub_nodes;
        public String title;
        public Integer type;

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
        public Builder(FeatureCardGod featureCardGod) {
            super(featureCardGod);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {featureCardGod};
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
            if (featureCardGod == null) {
                return;
            }
            this.sub_nodes = Message.copyOf(featureCardGod.sub_nodes);
            this.type = featureCardGod.type;
            this.floor = featureCardGod.floor;
            this.title = featureCardGod.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardGod build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FeatureCardGod(this, z, null) : (FeatureCardGod) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1585142437, "Ltbclient/FeatureCardGod;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1585142437, "Ltbclient/FeatureCardGod;");
                return;
            }
        }
        DEFAULT_SUB_NODES = Collections.emptyList();
        DEFAULT_TYPE = 0;
        DEFAULT_FLOOR = 0;
    }

    public /* synthetic */ FeatureCardGod(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardGod(Builder builder, boolean z) {
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
            List<User> list = builder.sub_nodes;
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
            Integer num2 = builder.floor;
            if (num2 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
                return;
            } else {
                this.title = str;
                return;
            }
        }
        this.sub_nodes = Message.immutableCopyOf(builder.sub_nodes);
        this.type = builder.type;
        this.floor = builder.floor;
        this.title = builder.title;
    }
}
