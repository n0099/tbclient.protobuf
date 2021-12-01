package tbclient.RecomVertical;

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
/* loaded from: classes4.dex */
public final class DislikeReason extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DISLIKE_ID;
    public static final String DEFAULT_DISLIKE_REASON = "";
    public static final String DEFAULT_EXTRA = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer dislike_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dislike_reason;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String extra;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DislikeReason> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer dislike_id;
        public String dislike_reason;
        public String extra;

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
        public Builder(DislikeReason dislikeReason) {
            super(dislikeReason);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dislikeReason};
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
            if (dislikeReason == null) {
                return;
            }
            this.dislike_reason = dislikeReason.dislike_reason;
            this.dislike_id = dislikeReason.dislike_id;
            this.extra = dislikeReason.extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DislikeReason build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DislikeReason(this, z, null) : (DislikeReason) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(881412359, "Ltbclient/RecomVertical/DislikeReason;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(881412359, "Ltbclient/RecomVertical/DislikeReason;");
                return;
            }
        }
        DEFAULT_DISLIKE_ID = 0;
    }

    public /* synthetic */ DislikeReason(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DislikeReason(Builder builder, boolean z) {
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
            String str = builder.dislike_reason;
            if (str == null) {
                this.dislike_reason = "";
            } else {
                this.dislike_reason = str;
            }
            Integer num = builder.dislike_id;
            if (num == null) {
                this.dislike_id = DEFAULT_DISLIKE_ID;
            } else {
                this.dislike_id = num;
            }
            String str2 = builder.extra;
            if (str2 == null) {
                this.extra = "";
                return;
            } else {
                this.extra = str2;
                return;
            }
        }
        this.dislike_reason = builder.dislike_reason;
        this.dislike_id = builder.dislike_id;
        this.extra = builder.extra;
    }
}
