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
/* loaded from: classes2.dex */
public final class Resource extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON_TEXT = "";
    public static final Long DEFAULT_POSITION;
    public static final Long DEFAULT_RES_ID;
    public static final String DEFAULT_RES_IMAGE = "";
    public static final String DEFAULT_RES_LINK = "";
    public static final String DEFAULT_RES_TITLE = "";
    public static final String DEFAULT_USER_IMAGE = "";
    public static final String DEFAULT_USER_LINK = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String icon_text;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long position;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long res_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String res_image;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String res_link;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String res_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_image;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Resource> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon_text;
        public Long position;
        public Long res_id;
        public String res_image;
        public String res_link;
        public String res_title;
        public String user_image;
        public String user_link;
        public String user_name;

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
        public Builder(Resource resource) {
            super(resource);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {resource};
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
            if (resource == null) {
                return;
            }
            this.res_id = resource.res_id;
            this.user_name = resource.user_name;
            this.user_image = resource.user_image;
            this.user_link = resource.user_link;
            this.res_title = resource.res_title;
            this.res_image = resource.res_image;
            this.res_link = resource.res_link;
            this.position = resource.position;
            this.icon_text = resource.icon_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Resource build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Resource(this, z, null) : (Resource) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1041439816, "Ltbclient/Personalized/Resource;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1041439816, "Ltbclient/Personalized/Resource;");
                return;
            }
        }
        DEFAULT_RES_ID = 0L;
        DEFAULT_POSITION = 0L;
    }

    public /* synthetic */ Resource(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Resource(Builder builder, boolean z) {
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
            Long l = builder.res_id;
            if (l == null) {
                this.res_id = DEFAULT_RES_ID;
            } else {
                this.res_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_image;
            if (str2 == null) {
                this.user_image = "";
            } else {
                this.user_image = str2;
            }
            String str3 = builder.user_link;
            if (str3 == null) {
                this.user_link = "";
            } else {
                this.user_link = str3;
            }
            String str4 = builder.res_title;
            if (str4 == null) {
                this.res_title = "";
            } else {
                this.res_title = str4;
            }
            String str5 = builder.res_image;
            if (str5 == null) {
                this.res_image = "";
            } else {
                this.res_image = str5;
            }
            String str6 = builder.res_link;
            if (str6 == null) {
                this.res_link = "";
            } else {
                this.res_link = str6;
            }
            Long l2 = builder.position;
            if (l2 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = l2;
            }
            String str7 = builder.icon_text;
            if (str7 == null) {
                this.icon_text = "";
                return;
            } else {
                this.icon_text = str7;
                return;
            }
        }
        this.res_id = builder.res_id;
        this.user_name = builder.user_name;
        this.user_image = builder.user_image;
        this.user_link = builder.user_link;
        this.res_title = builder.res_title;
        this.res_image = builder.res_image;
        this.res_link = builder.res_link;
        this.position = builder.position;
        this.icon_text = builder.icon_text;
    }
}
