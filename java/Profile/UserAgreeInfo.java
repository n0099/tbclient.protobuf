package tbclient.Profile;

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
/* loaded from: classes2.dex */
public final class UserAgreeInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_ALA_AGREE_NUM;
    public static final Integer DEFAULT_HAS_USER_AGREE;
    public static final Long DEFAULT_NORMAL_AGREE_NUM;
    public static final Long DEFAULT_TOTAL_AGREE_NUM;
    public static final Long DEFAULT_USER_AGREE_NUM;
    public static final Long DEFAULT_VIDEO_AGREE_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long ala_agree_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_user_agree;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long normal_agree_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long total_agree_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_agree_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long video_agree_num;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserAgreeInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long ala_agree_num;
        public Integer has_user_agree;
        public Long normal_agree_num;
        public Long total_agree_num;
        public Long user_agree_num;
        public Long video_agree_num;

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
        public Builder(UserAgreeInfo userAgreeInfo) {
            super(userAgreeInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userAgreeInfo};
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
            if (userAgreeInfo == null) {
                return;
            }
            this.total_agree_num = userAgreeInfo.total_agree_num;
            this.normal_agree_num = userAgreeInfo.normal_agree_num;
            this.user_agree_num = userAgreeInfo.user_agree_num;
            this.video_agree_num = userAgreeInfo.video_agree_num;
            this.ala_agree_num = userAgreeInfo.ala_agree_num;
            this.has_user_agree = userAgreeInfo.has_user_agree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserAgreeInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserAgreeInfo(this, z, null) : (UserAgreeInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1138840868, "Ltbclient/Profile/UserAgreeInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1138840868, "Ltbclient/Profile/UserAgreeInfo;");
                return;
            }
        }
        DEFAULT_TOTAL_AGREE_NUM = 0L;
        DEFAULT_NORMAL_AGREE_NUM = 0L;
        DEFAULT_USER_AGREE_NUM = 0L;
        DEFAULT_VIDEO_AGREE_NUM = 0L;
        DEFAULT_ALA_AGREE_NUM = 0L;
        DEFAULT_HAS_USER_AGREE = 0;
    }

    public /* synthetic */ UserAgreeInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgreeInfo(Builder builder, boolean z) {
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
            Long l = builder.total_agree_num;
            if (l == null) {
                this.total_agree_num = DEFAULT_TOTAL_AGREE_NUM;
            } else {
                this.total_agree_num = l;
            }
            Long l2 = builder.normal_agree_num;
            if (l2 == null) {
                this.normal_agree_num = DEFAULT_NORMAL_AGREE_NUM;
            } else {
                this.normal_agree_num = l2;
            }
            Long l3 = builder.user_agree_num;
            if (l3 == null) {
                this.user_agree_num = DEFAULT_USER_AGREE_NUM;
            } else {
                this.user_agree_num = l3;
            }
            Long l4 = builder.video_agree_num;
            if (l4 == null) {
                this.video_agree_num = DEFAULT_VIDEO_AGREE_NUM;
            } else {
                this.video_agree_num = l4;
            }
            Long l5 = builder.ala_agree_num;
            if (l5 == null) {
                this.ala_agree_num = DEFAULT_ALA_AGREE_NUM;
            } else {
                this.ala_agree_num = l5;
            }
            Integer num = builder.has_user_agree;
            if (num == null) {
                this.has_user_agree = DEFAULT_HAS_USER_AGREE;
                return;
            } else {
                this.has_user_agree = num;
                return;
            }
        }
        this.total_agree_num = builder.total_agree_num;
        this.normal_agree_num = builder.normal_agree_num;
        this.user_agree_num = builder.user_agree_num;
        this.video_agree_num = builder.video_agree_num;
        this.ala_agree_num = builder.ala_agree_num;
        this.has_user_agree = builder.has_user_agree;
    }
}
