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
/* loaded from: classes3.dex */
public final class ApplyStatus extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_FDIR_NEXT_APPLY_TIME;
    public static final Integer DEFAULT_IS_AVATAR_APPLYING;
    public static final Integer DEFAULT_IS_DESC_APPLYING;
    public static final Integer DEFAULT_IS_FDIR_APPLYING;
    public static final Integer DEFAULT_NEXT_AVATAR_APPLY_TIME;
    public static final Integer DEFAULT_NEXT_DESC_APPLY_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer fdir_next_apply_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_avatar_applying;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_desc_applying;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_fdir_applying;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer next_avatar_apply_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer next_desc_apply_time;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ApplyStatus> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer fdir_next_apply_time;
        public Integer is_avatar_applying;
        public Integer is_desc_applying;
        public Integer is_fdir_applying;
        public Integer next_avatar_apply_time;
        public Integer next_desc_apply_time;

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
        public Builder(ApplyStatus applyStatus) {
            super(applyStatus);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {applyStatus};
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
            if (applyStatus == null) {
                return;
            }
            this.is_avatar_applying = applyStatus.is_avatar_applying;
            this.is_desc_applying = applyStatus.is_desc_applying;
            this.next_avatar_apply_time = applyStatus.next_avatar_apply_time;
            this.next_desc_apply_time = applyStatus.next_desc_apply_time;
            this.is_fdir_applying = applyStatus.is_fdir_applying;
            this.fdir_next_apply_time = applyStatus.fdir_next_apply_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ApplyStatus build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ApplyStatus(this, z, null) : (ApplyStatus) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2030741564, "Ltbclient/GetForumDetail/ApplyStatus;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2030741564, "Ltbclient/GetForumDetail/ApplyStatus;");
                return;
            }
        }
        DEFAULT_IS_AVATAR_APPLYING = 0;
        DEFAULT_IS_DESC_APPLYING = 0;
        DEFAULT_NEXT_AVATAR_APPLY_TIME = 0;
        DEFAULT_NEXT_DESC_APPLY_TIME = 0;
        DEFAULT_IS_FDIR_APPLYING = 0;
        DEFAULT_FDIR_NEXT_APPLY_TIME = 0;
    }

    public /* synthetic */ ApplyStatus(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyStatus(Builder builder, boolean z) {
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
            Integer num = builder.is_avatar_applying;
            if (num == null) {
                this.is_avatar_applying = DEFAULT_IS_AVATAR_APPLYING;
            } else {
                this.is_avatar_applying = num;
            }
            Integer num2 = builder.is_desc_applying;
            if (num2 == null) {
                this.is_desc_applying = DEFAULT_IS_DESC_APPLYING;
            } else {
                this.is_desc_applying = num2;
            }
            Integer num3 = builder.next_avatar_apply_time;
            if (num3 == null) {
                this.next_avatar_apply_time = DEFAULT_NEXT_AVATAR_APPLY_TIME;
            } else {
                this.next_avatar_apply_time = num3;
            }
            Integer num4 = builder.next_desc_apply_time;
            if (num4 == null) {
                this.next_desc_apply_time = DEFAULT_NEXT_DESC_APPLY_TIME;
            } else {
                this.next_desc_apply_time = num4;
            }
            Integer num5 = builder.is_fdir_applying;
            if (num5 == null) {
                this.is_fdir_applying = DEFAULT_IS_FDIR_APPLYING;
            } else {
                this.is_fdir_applying = num5;
            }
            Integer num6 = builder.fdir_next_apply_time;
            if (num6 == null) {
                this.fdir_next_apply_time = DEFAULT_FDIR_NEXT_APPLY_TIME;
                return;
            } else {
                this.fdir_next_apply_time = num6;
                return;
            }
        }
        this.is_avatar_applying = builder.is_avatar_applying;
        this.is_desc_applying = builder.is_desc_applying;
        this.next_avatar_apply_time = builder.next_avatar_apply_time;
        this.next_desc_apply_time = builder.next_desc_apply_time;
        this.is_fdir_applying = builder.is_fdir_applying;
        this.fdir_next_apply_time = builder.fdir_next_apply_time;
    }
}
