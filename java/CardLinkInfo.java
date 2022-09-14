package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CardLinkInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_STYLE = "";
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_CONTENT1 = "";
    public static final String DEFAULT_CONTENT2 = "";
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_TAG_COLOR = "";
    public static final String DEFAULT_TAG_TEXT = "";
    public static final String DEFAULT_TEXT_BTN_STATUS = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String btn_style;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content1;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String content2;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String image_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tag_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tag_text;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String text_btn_status;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CardLinkInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String btn_style;
        public String btn_text;
        public String content1;
        public String content2;
        public String image_url;
        public String tag_color;
        public String tag_text;
        public String text_btn_status;
        public String title;
        public String type;
        public String url;

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
        public Builder(CardLinkInfo cardLinkInfo) {
            super(cardLinkInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {cardLinkInfo};
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
            if (cardLinkInfo == null) {
                return;
            }
            this.type = cardLinkInfo.type;
            this.image_url = cardLinkInfo.image_url;
            this.tag_text = cardLinkInfo.tag_text;
            this.tag_color = cardLinkInfo.tag_color;
            this.title = cardLinkInfo.title;
            this.content1 = cardLinkInfo.content1;
            this.content2 = cardLinkInfo.content2;
            this.btn_style = cardLinkInfo.btn_style;
            this.btn_text = cardLinkInfo.btn_text;
            this.text_btn_status = cardLinkInfo.text_btn_status;
            this.url = cardLinkInfo.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardLinkInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CardLinkInfo(this, z, null) : (CardLinkInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ CardLinkInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLinkInfo(Builder builder, boolean z) {
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
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.image_url;
            if (str2 == null) {
                this.image_url = "";
            } else {
                this.image_url = str2;
            }
            String str3 = builder.tag_text;
            if (str3 == null) {
                this.tag_text = "";
            } else {
                this.tag_text = str3;
            }
            String str4 = builder.tag_color;
            if (str4 == null) {
                this.tag_color = "";
            } else {
                this.tag_color = str4;
            }
            String str5 = builder.title;
            if (str5 == null) {
                this.title = "";
            } else {
                this.title = str5;
            }
            String str6 = builder.content1;
            if (str6 == null) {
                this.content1 = "";
            } else {
                this.content1 = str6;
            }
            String str7 = builder.content2;
            if (str7 == null) {
                this.content2 = "";
            } else {
                this.content2 = str7;
            }
            String str8 = builder.btn_style;
            if (str8 == null) {
                this.btn_style = "";
            } else {
                this.btn_style = str8;
            }
            String str9 = builder.btn_text;
            if (str9 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str9;
            }
            String str10 = builder.text_btn_status;
            if (str10 == null) {
                this.text_btn_status = "";
            } else {
                this.text_btn_status = str10;
            }
            String str11 = builder.url;
            if (str11 == null) {
                this.url = "";
                return;
            } else {
                this.url = str11;
                return;
            }
        }
        this.type = builder.type;
        this.image_url = builder.image_url;
        this.tag_text = builder.tag_text;
        this.tag_color = builder.tag_color;
        this.title = builder.title;
        this.content1 = builder.content1;
        this.content2 = builder.content2;
        this.btn_style = builder.btn_style;
        this.btn_text = builder.btn_text;
        this.text_btn_status = builder.text_btn_status;
        this.url = builder.url;
    }
}
