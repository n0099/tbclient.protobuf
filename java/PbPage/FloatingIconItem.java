package tbclient.PbPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class FloatingIconItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CLICK_STATISTICS_URL = "";
    public static final String DEFAULT_DEEPLINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIEW_STATISTICS_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String click_statistics_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String deeplink;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String view_statistics_url;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<FloatingIconItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String click_statistics_url;
        public String deeplink;
        public String icon_url;
        public String package_name;
        public String scheme;
        public String url;
        public String view_statistics_url;

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
        public Builder(FloatingIconItem floatingIconItem) {
            super(floatingIconItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {floatingIconItem};
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
            if (floatingIconItem == null) {
                return;
            }
            this.url = floatingIconItem.url;
            this.icon_url = floatingIconItem.icon_url;
            this.view_statistics_url = floatingIconItem.view_statistics_url;
            this.click_statistics_url = floatingIconItem.click_statistics_url;
            this.deeplink = floatingIconItem.deeplink;
            this.scheme = floatingIconItem.scheme;
            this.package_name = floatingIconItem.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatingIconItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FloatingIconItem(this, z, null) : (FloatingIconItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ FloatingIconItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingIconItem(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            String str3 = builder.view_statistics_url;
            if (str3 == null) {
                this.view_statistics_url = "";
            } else {
                this.view_statistics_url = str3;
            }
            String str4 = builder.click_statistics_url;
            if (str4 == null) {
                this.click_statistics_url = "";
            } else {
                this.click_statistics_url = str4;
            }
            String str5 = builder.deeplink;
            if (str5 == null) {
                this.deeplink = "";
            } else {
                this.deeplink = str5;
            }
            String str6 = builder.scheme;
            if (str6 == null) {
                this.scheme = "";
            } else {
                this.scheme = str6;
            }
            String str7 = builder.package_name;
            if (str7 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str7;
                return;
            }
        }
        this.url = builder.url;
        this.icon_url = builder.icon_url;
        this.view_statistics_url = builder.view_statistics_url;
        this.click_statistics_url = builder.click_statistics_url;
        this.deeplink = builder.deeplink;
        this.scheme = builder.scheme;
        this.package_name = builder.package_name;
    }
}
