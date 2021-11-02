package tbclient.PbPage;

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
public final class PostBanner extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BANNER_NAME = "";
    public static final String DEFAULT_BANNER_PIC = "";
    public static final Integer DEFAULT_BANNER_POSITION;
    public static final String DEFAULT_BANNER_URL = "";
    public static final Integer DEFAULT_CLIENT_TYPE;
    public static final Integer DEFAULT_LINK_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String banner_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_pic;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer banner_position;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer client_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer link_type;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<PostBanner> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String banner_name;
        public String banner_pic;
        public Integer banner_position;
        public String banner_url;
        public Integer client_type;
        public Integer link_type;

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
        public Builder(PostBanner postBanner) {
            super(postBanner);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {postBanner};
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
            if (postBanner == null) {
                return;
            }
            this.banner_pic = postBanner.banner_pic;
            this.banner_name = postBanner.banner_name;
            this.banner_position = postBanner.banner_position;
            this.link_type = postBanner.link_type;
            this.banner_url = postBanner.banner_url;
            this.client_type = postBanner.client_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostBanner build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PostBanner(this, z, null) : (PostBanner) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-388162901, "Ltbclient/PbPage/PostBanner;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-388162901, "Ltbclient/PbPage/PostBanner;");
                return;
            }
        }
        DEFAULT_BANNER_POSITION = 0;
        DEFAULT_LINK_TYPE = 0;
        DEFAULT_CLIENT_TYPE = 0;
    }

    public /* synthetic */ PostBanner(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostBanner(Builder builder, boolean z) {
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
            String str = builder.banner_pic;
            if (str == null) {
                this.banner_pic = "";
            } else {
                this.banner_pic = str;
            }
            String str2 = builder.banner_name;
            if (str2 == null) {
                this.banner_name = "";
            } else {
                this.banner_name = str2;
            }
            Integer num = builder.banner_position;
            if (num == null) {
                this.banner_position = DEFAULT_BANNER_POSITION;
            } else {
                this.banner_position = num;
            }
            Integer num2 = builder.link_type;
            if (num2 == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = num2;
            }
            String str3 = builder.banner_url;
            if (str3 == null) {
                this.banner_url = "";
            } else {
                this.banner_url = str3;
            }
            Integer num3 = builder.client_type;
            if (num3 == null) {
                this.client_type = DEFAULT_CLIENT_TYPE;
                return;
            } else {
                this.client_type = num3;
                return;
            }
        }
        this.banner_pic = builder.banner_pic;
        this.banner_name = builder.banner_name;
        this.banner_position = builder.banner_position;
        this.link_type = builder.link_type;
        this.banner_url = builder.banner_url;
        this.client_type = builder.client_type;
    }
}
