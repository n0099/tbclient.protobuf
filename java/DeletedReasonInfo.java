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
public final class DeletedReasonInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_BOOMGROW;
    public static final Integer DEFAULT_IS_GRAYS_CALE_FORUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_boomgrow;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_grays_cale_forum;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_boomgrow;
        public Integer is_grays_cale_forum;

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
        public Builder(DeletedReasonInfo deletedReasonInfo) {
            super(deletedReasonInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {deletedReasonInfo};
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
            if (deletedReasonInfo == null) {
                return;
            }
            this.is_grays_cale_forum = deletedReasonInfo.is_grays_cale_forum;
            this.is_boomgrow = deletedReasonInfo.is_boomgrow;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeletedReasonInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DeletedReasonInfo(this, z, null);
            }
            return (DeletedReasonInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-230127110, "Ltbclient/DeletedReasonInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-230127110, "Ltbclient/DeletedReasonInfo;");
                return;
            }
        }
        DEFAULT_IS_GRAYS_CALE_FORUM = 0;
        DEFAULT_IS_BOOMGROW = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletedReasonInfo(Builder builder, boolean z) {
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
            Integer num = builder.is_grays_cale_forum;
            if (num == null) {
                this.is_grays_cale_forum = DEFAULT_IS_GRAYS_CALE_FORUM;
            } else {
                this.is_grays_cale_forum = num;
            }
            Integer num2 = builder.is_boomgrow;
            if (num2 == null) {
                this.is_boomgrow = DEFAULT_IS_BOOMGROW;
                return;
            } else {
                this.is_boomgrow = num2;
                return;
            }
        }
        this.is_grays_cale_forum = builder.is_grays_cale_forum;
        this.is_boomgrow = builder.is_boomgrow;
    }

    public /* synthetic */ DeletedReasonInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
