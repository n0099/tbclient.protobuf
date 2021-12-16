package tbclient.PbPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes5.dex */
public final class FloatingIconItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CLICK_STATISTICS_URL = "";
    public static final String DEFAULT_DEEPLINK = "";
    public static final String DEFAULT_FLOAT_TYPE = "";
    public static final String DEFAULT_FOLD_LOTTIE = "";
    public static final String DEFAULT_FOLD_NAME = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_UNFOLD_LOTTIE = "";
    public static final String DEFAULT_UNFOLD_NAME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIEW_STATISTICS_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String click_statistics_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String deeplink;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String float_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String fold_lottie;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String fold_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String unfold_lottie;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String unfold_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String view_statistics_url;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<FloatingIconItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String click_statistics_url;
        public String deeplink;
        public String float_type;
        public String fold_lottie;
        public String fold_name;
        public String icon_url;
        public String package_name;
        public String scheme;
        public String unfold_lottie;
        public String unfold_name;
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
            this.fold_lottie = floatingIconItem.fold_lottie;
            this.unfold_lottie = floatingIconItem.unfold_lottie;
            this.float_type = floatingIconItem.float_type;
            this.fold_name = floatingIconItem.fold_name;
            this.unfold_name = floatingIconItem.unfold_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatingIconItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FloatingIconItem(this, z, null) : (FloatingIconItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
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
            } else {
                this.package_name = str7;
            }
            String str8 = builder.fold_lottie;
            if (str8 == null) {
                this.fold_lottie = "";
            } else {
                this.fold_lottie = str8;
            }
            String str9 = builder.unfold_lottie;
            if (str9 == null) {
                this.unfold_lottie = "";
            } else {
                this.unfold_lottie = str9;
            }
            String str10 = builder.float_type;
            if (str10 == null) {
                this.float_type = "";
            } else {
                this.float_type = str10;
            }
            String str11 = builder.fold_name;
            if (str11 == null) {
                this.fold_name = "";
            } else {
                this.fold_name = str11;
            }
            String str12 = builder.unfold_name;
            if (str12 == null) {
                this.unfold_name = "";
                return;
            } else {
                this.unfold_name = str12;
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
        this.fold_lottie = builder.fold_lottie;
        this.unfold_lottie = builder.unfold_lottie;
        this.float_type = builder.float_type;
        this.fold_name = builder.fold_name;
        this.unfold_name = builder.unfold_name;
    }
}
