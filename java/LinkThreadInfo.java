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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class LinkThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<LinkThreadContent> DEFAULT_LINK_CONTENT;
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_LINK_URL_CODE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LinkThreadContent> link_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String link_url_code;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LinkThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<LinkThreadContent> link_content;
        public String link_url;
        public String link_url_code;

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
        public Builder(LinkThreadInfo linkThreadInfo) {
            super(linkThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {linkThreadInfo};
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
            if (linkThreadInfo == null) {
                return;
            }
            this.link_url = linkThreadInfo.link_url;
            this.link_url_code = linkThreadInfo.link_url_code;
            this.link_content = Message.copyOf(linkThreadInfo.link_content);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LinkThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new LinkThreadInfo(this, z, null) : (LinkThreadInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1723713825, "Ltbclient/LinkThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1723713825, "Ltbclient/LinkThreadInfo;");
                return;
            }
        }
        DEFAULT_LINK_CONTENT = Collections.emptyList();
    }

    public /* synthetic */ LinkThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkThreadInfo(Builder builder, boolean z) {
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
            String str = builder.link_url;
            if (str == null) {
                this.link_url = "";
            } else {
                this.link_url = str;
            }
            String str2 = builder.link_url_code;
            if (str2 == null) {
                this.link_url_code = "";
            } else {
                this.link_url_code = str2;
            }
            List<LinkThreadContent> list = builder.link_content;
            if (list == null) {
                this.link_content = DEFAULT_LINK_CONTENT;
                return;
            } else {
                this.link_content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.link_url = builder.link_url;
        this.link_url_code = builder.link_url_code;
        this.link_content = Message.immutableCopyOf(builder.link_content);
    }
}
