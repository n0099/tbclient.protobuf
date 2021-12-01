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
/* loaded from: classes4.dex */
public final class OriForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ORI_AVATAR = "";
    public static final Long DEFAULT_ORI_FID;
    public static final String DEFAULT_ORI_FNAME = "";
    public static final Long DEFAULT_ORI_MEMBER_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ori_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ori_fid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ori_fname;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long ori_member_num;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<OriForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ori_avatar;
        public Long ori_fid;
        public String ori_fname;
        public Long ori_member_num;

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
        public Builder(OriForumInfo oriForumInfo) {
            super(oriForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {oriForumInfo};
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
            if (oriForumInfo == null) {
                return;
            }
            this.ori_fid = oriForumInfo.ori_fid;
            this.ori_fname = oriForumInfo.ori_fname;
            this.ori_avatar = oriForumInfo.ori_avatar;
            this.ori_member_num = oriForumInfo.ori_member_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new OriForumInfo(this, z, null) : (OriForumInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(282302344, "Ltbclient/OriForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(282302344, "Ltbclient/OriForumInfo;");
                return;
            }
        }
        DEFAULT_ORI_FID = 0L;
        DEFAULT_ORI_MEMBER_NUM = 0L;
    }

    public /* synthetic */ OriForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriForumInfo(Builder builder, boolean z) {
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
            Long l = builder.ori_fid;
            if (l == null) {
                this.ori_fid = DEFAULT_ORI_FID;
            } else {
                this.ori_fid = l;
            }
            String str = builder.ori_fname;
            if (str == null) {
                this.ori_fname = "";
            } else {
                this.ori_fname = str;
            }
            String str2 = builder.ori_avatar;
            if (str2 == null) {
                this.ori_avatar = "";
            } else {
                this.ori_avatar = str2;
            }
            Long l2 = builder.ori_member_num;
            if (l2 == null) {
                this.ori_member_num = DEFAULT_ORI_MEMBER_NUM;
                return;
            } else {
                this.ori_member_num = l2;
                return;
            }
        }
        this.ori_fid = builder.ori_fid;
        this.ori_fname = builder.ori_fname;
        this.ori_avatar = builder.ori_avatar;
        this.ori_member_num = builder.ori_member_num;
    }
}
