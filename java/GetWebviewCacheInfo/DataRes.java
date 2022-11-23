package tbclient.GetWebviewCacheInfo;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_MD5 = "";
    public static final List<Offpack> DEFAULT_OFFPACK_LIST;
    public static final List<PackageInfo> DEFAULT_PATCH;
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final PackageInfo latest;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Offpack> offpack_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PackageInfo> patch;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String version;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public PackageInfo latest;
        public String md5;
        public List<Offpack> offpack_list;
        public List<PackageInfo> patch;
        public String src;
        public String version;
        public String webview_version;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.src = dataRes.src;
            this.webview_version = dataRes.webview_version;
            this.md5 = dataRes.md5;
            this.latest = dataRes.latest;
            this.patch = Message.copyOf(dataRes.patch);
            this.version = dataRes.version;
            this.offpack_list = Message.copyOf(dataRes.offpack_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1319158129, "Ltbclient/GetWebviewCacheInfo/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1319158129, "Ltbclient/GetWebviewCacheInfo/DataRes;");
                return;
            }
        }
        DEFAULT_PATCH = Collections.emptyList();
        DEFAULT_OFFPACK_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            String str = builder.src;
            if (str == null) {
                this.src = "";
            } else {
                this.src = str;
            }
            String str2 = builder.webview_version;
            if (str2 == null) {
                this.webview_version = "";
            } else {
                this.webview_version = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
            } else {
                this.md5 = str3;
            }
            this.latest = builder.latest;
            List<PackageInfo> list = builder.patch;
            if (list == null) {
                this.patch = DEFAULT_PATCH;
            } else {
                this.patch = Message.immutableCopyOf(list);
            }
            String str4 = builder.version;
            if (str4 == null) {
                this.version = "";
            } else {
                this.version = str4;
            }
            List<Offpack> list2 = builder.offpack_list;
            if (list2 == null) {
                this.offpack_list = DEFAULT_OFFPACK_LIST;
                return;
            } else {
                this.offpack_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.src = builder.src;
        this.webview_version = builder.webview_version;
        this.md5 = builder.md5;
        this.latest = builder.latest;
        this.patch = Message.immutableCopyOf(builder.patch);
        this.version = builder.version;
        this.offpack_list = Message.immutableCopyOf(builder.offpack_list);
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
