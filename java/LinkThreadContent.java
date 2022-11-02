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
public final class LinkThreadContent extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_LINK_ABSTRACT = "";
    public static final String DEFAULT_LINK_HEAD_BIG_PIC = "";
    public static final String DEFAULT_LINK_HEAD_PIC = "";
    public static final String DEFAULT_LINK_HEAD_SMALL_PIC = "";
    public static final String DEFAULT_LINK_TITLE = "";
    public static final Integer DEFAULT_LINK_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_abstract;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link_head_big_pic;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_head_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_head_small_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer link_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LinkThreadContent> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String link_abstract;
        public String link_head_big_pic;
        public String link_head_pic;
        public String link_head_small_pic;
        public String link_title;
        public Integer link_type;

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
        public Builder(LinkThreadContent linkThreadContent) {
            super(linkThreadContent);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {linkThreadContent};
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
            if (linkThreadContent == null) {
                return;
            }
            this.link_type = linkThreadContent.link_type;
            this.link_title = linkThreadContent.link_title;
            this.link_abstract = linkThreadContent.link_abstract;
            this.link_head_pic = linkThreadContent.link_head_pic;
            this.link_head_small_pic = linkThreadContent.link_head_small_pic;
            this.link_head_big_pic = linkThreadContent.link_head_big_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadContent build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LinkThreadContent(this, z, null);
            }
            return (LinkThreadContent) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1273981936, "Ltbclient/LinkThreadContent;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1273981936, "Ltbclient/LinkThreadContent;");
                return;
            }
        }
        DEFAULT_LINK_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkThreadContent(Builder builder, boolean z) {
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
            Integer num = builder.link_type;
            if (num == null) {
                this.link_type = DEFAULT_LINK_TYPE;
            } else {
                this.link_type = num;
            }
            String str = builder.link_title;
            if (str == null) {
                this.link_title = "";
            } else {
                this.link_title = str;
            }
            String str2 = builder.link_abstract;
            if (str2 == null) {
                this.link_abstract = "";
            } else {
                this.link_abstract = str2;
            }
            String str3 = builder.link_head_pic;
            if (str3 == null) {
                this.link_head_pic = "";
            } else {
                this.link_head_pic = str3;
            }
            String str4 = builder.link_head_small_pic;
            if (str4 == null) {
                this.link_head_small_pic = "";
            } else {
                this.link_head_small_pic = str4;
            }
            String str5 = builder.link_head_big_pic;
            if (str5 == null) {
                this.link_head_big_pic = "";
                return;
            } else {
                this.link_head_big_pic = str5;
                return;
            }
        }
        this.link_type = builder.link_type;
        this.link_title = builder.link_title;
        this.link_abstract = builder.link_abstract;
        this.link_head_pic = builder.link_head_pic;
        this.link_head_small_pic = builder.link_head_small_pic;
        this.link_head_big_pic = builder.link_head_big_pic;
    }

    public /* synthetic */ LinkThreadContent(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
