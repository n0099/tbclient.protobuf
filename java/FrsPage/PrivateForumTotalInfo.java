package tbclient.FrsPage;

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
import tbclient.PrivateForumInfo;
import tbclient.PrivatePopInfo;
/* loaded from: classes10.dex */
public final class PrivateForumTotalInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_PRIVATE_FORUM_TASKPERCENT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)
    public final HeadImgs head_imgs;
    @ProtoField(tag = 3)
    public final PrivateForumInfo private_forum_info;
    @ProtoField(tag = 2)
    public final PrivatePopInfo private_forum_popinfo;
    @ProtoField(tag = 1)
    public final PrivateForumShareinfo private_forum_shareinfo;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer private_forum_taskpercent;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PrivateForumTotalInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public HeadImgs head_imgs;
        public PrivateForumInfo private_forum_info;
        public PrivatePopInfo private_forum_popinfo;
        public PrivateForumShareinfo private_forum_shareinfo;
        public Integer private_forum_taskpercent;

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
        public Builder(PrivateForumTotalInfo privateForumTotalInfo) {
            super(privateForumTotalInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {privateForumTotalInfo};
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
            if (privateForumTotalInfo == null) {
                return;
            }
            this.private_forum_shareinfo = privateForumTotalInfo.private_forum_shareinfo;
            this.private_forum_popinfo = privateForumTotalInfo.private_forum_popinfo;
            this.private_forum_info = privateForumTotalInfo.private_forum_info;
            this.private_forum_taskpercent = privateForumTotalInfo.private_forum_taskpercent;
            this.head_imgs = privateForumTotalInfo.head_imgs;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTotalInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PrivateForumTotalInfo(this, z, null) : (PrivateForumTotalInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-989464118, "Ltbclient/FrsPage/PrivateForumTotalInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-989464118, "Ltbclient/FrsPage/PrivateForumTotalInfo;");
                return;
            }
        }
        DEFAULT_PRIVATE_FORUM_TASKPERCENT = 0;
    }

    public /* synthetic */ PrivateForumTotalInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateForumTotalInfo(Builder builder, boolean z) {
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
            this.private_forum_shareinfo = builder.private_forum_shareinfo;
            this.private_forum_popinfo = builder.private_forum_popinfo;
            this.private_forum_info = builder.private_forum_info;
            Integer num = builder.private_forum_taskpercent;
            if (num == null) {
                this.private_forum_taskpercent = DEFAULT_PRIVATE_FORUM_TASKPERCENT;
            } else {
                this.private_forum_taskpercent = num;
            }
            this.head_imgs = builder.head_imgs;
            return;
        }
        this.private_forum_shareinfo = builder.private_forum_shareinfo;
        this.private_forum_popinfo = builder.private_forum_popinfo;
        this.private_forum_info = builder.private_forum_info;
        this.private_forum_taskpercent = builder.private_forum_taskpercent;
        this.head_imgs = builder.head_imgs;
    }
}
