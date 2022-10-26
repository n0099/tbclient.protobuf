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
public final class RewardMaterial extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_IS_MATCHED;
    public static final Integer DEFAULT_IS_NEWEST_MATCHED_LEVEL;
    public static final String DEFAULT_UNLOCK_LEVEL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_matched;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_newest_matched_level;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String unlock_level;

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
        public Integer is_matched;
        public Integer is_newest_matched_level;
        public String unlock_level;

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
        public Builder(RewardMaterial rewardMaterial) {
            super(rewardMaterial);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {rewardMaterial};
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
            if (rewardMaterial == null) {
                return;
            }
            this.icon = rewardMaterial.icon;
            this.unlock_level = rewardMaterial.unlock_level;
            this.is_matched = rewardMaterial.is_matched;
            this.is_newest_matched_level = rewardMaterial.is_newest_matched_level;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RewardMaterial build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RewardMaterial(this, z, null);
            }
            return (RewardMaterial) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-941397157, "Ltbclient/RewardMaterial;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-941397157, "Ltbclient/RewardMaterial;");
                return;
            }
        }
        DEFAULT_IS_MATCHED = 0;
        DEFAULT_IS_NEWEST_MATCHED_LEVEL = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMaterial(Builder builder, boolean z) {
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
            String str2 = builder.unlock_level;
            if (str2 == null) {
                this.unlock_level = "";
            } else {
                this.unlock_level = str2;
            }
            Integer num = builder.is_matched;
            if (num == null) {
                this.is_matched = DEFAULT_IS_MATCHED;
            } else {
                this.is_matched = num;
            }
            Integer num2 = builder.is_newest_matched_level;
            if (num2 == null) {
                this.is_newest_matched_level = DEFAULT_IS_NEWEST_MATCHED_LEVEL;
                return;
            } else {
                this.is_newest_matched_level = num2;
                return;
            }
        }
        this.icon = builder.icon;
        this.unlock_level = builder.unlock_level;
        this.is_matched = builder.is_matched;
        this.is_newest_matched_level = builder.is_newest_matched_level;
    }

    public /* synthetic */ RewardMaterial(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
