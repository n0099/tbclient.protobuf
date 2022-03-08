package tbclient.Personalized;

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
public final class AgeSexModule extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<TagStruct> DEFAULT_AGE_TAG;
    public static final List<TagStruct> DEFAULT_SEX_TAG;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TagStruct> age_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagStruct> sex_tag;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AgeSexModule> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<TagStruct> age_tag;
        public List<TagStruct> sex_tag;

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
        public Builder(AgeSexModule ageSexModule) {
            super(ageSexModule);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {ageSexModule};
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
            if (ageSexModule == null) {
                return;
            }
            this.sex_tag = Message.copyOf(ageSexModule.sex_tag);
            this.age_tag = Message.copyOf(ageSexModule.age_tag);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgeSexModule build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AgeSexModule(this, z, null) : (AgeSexModule) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2083909965, "Ltbclient/Personalized/AgeSexModule;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2083909965, "Ltbclient/Personalized/AgeSexModule;");
                return;
            }
        }
        DEFAULT_SEX_TAG = Collections.emptyList();
        DEFAULT_AGE_TAG = Collections.emptyList();
    }

    public /* synthetic */ AgeSexModule(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeSexModule(Builder builder, boolean z) {
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
            List<TagStruct> list = builder.sex_tag;
            if (list == null) {
                this.sex_tag = DEFAULT_SEX_TAG;
            } else {
                this.sex_tag = Message.immutableCopyOf(list);
            }
            List<TagStruct> list2 = builder.age_tag;
            if (list2 == null) {
                this.age_tag = DEFAULT_AGE_TAG;
                return;
            } else {
                this.age_tag = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.sex_tag = Message.immutableCopyOf(builder.sex_tag);
        this.age_tag = Message.immutableCopyOf(builder.age_tag);
    }
}
