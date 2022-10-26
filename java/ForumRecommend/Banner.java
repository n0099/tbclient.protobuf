package tbclient.ForumRecommend;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Banner extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String link;
        public String pic_url;
        public String tag_name_url;
        public String tag_name_wh;
        public String title;

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
        public Builder(Banner banner) {
            super(banner);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {banner};
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
            if (banner == null) {
                return;
            }
            this.link = banner.link;
            this.pic_url = banner.pic_url;
            this.title = banner.title;
            this.tag_name_url = banner.tag_name_url;
            this.tag_name_wh = banner.tag_name_wh;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Banner(this, z, null);
            }
            return (Banner) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.link;
            if (str == null) {
                this.link = "";
            } else {
                this.link = str;
            }
            String str2 = builder.pic_url;
            if (str2 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.tag_name_url;
            if (str4 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str4;
            }
            String str5 = builder.tag_name_wh;
            if (str5 == null) {
                this.tag_name_wh = "";
                return;
            } else {
                this.tag_name_wh = str5;
                return;
            }
        }
        this.link = builder.link;
        this.pic_url = builder.pic_url;
        this.title = builder.title;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
    }

    public /* synthetic */ Banner(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
