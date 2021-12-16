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
/* loaded from: classes5.dex */
public final class ItemInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_APK_NAME = "";
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_BUTTON_LINK = "";
    public static final Integer DEFAULT_BUTTON_LINK_TYPE;
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final String DEFAULT_CATEGORY1 = "";
    public static final String DEFAULT_CATEGORY2 = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Double DEFAULT_ICON_SIZE;
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_ID;
    public static final Integer DEFAULT_IS_SCHOOL;
    public static final String DEFAULT_ITEM_APPID = "";
    public static final List<ItemOptions> DEFAULT_ITEM_OPTIONS;
    public static final String DEFAULT_NAME = "";
    public static final List<String> DEFAULT_TAGS;
    public static final List<TagInfo> DEFAULT_TAG_INFO;
    public static final String DEFAULT_TEMPLATE_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 24)
    public final ApkDetail apk_detail;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String apk_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String button_link;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer button_link_type;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String button_name;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String category1;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String category2;
    @ProtoField(tag = 16)
    public final ItemDetail detail;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double icon_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_school;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String item_appid;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ItemOptions> item_options;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 17)
    public final Ranking ranking;
    @ProtoField(tag = 8)
    public final ItemTable score;
    @ProtoField(tag = 18)
    public final ItemService service;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<TagInfo> tag_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String template_name;
    @ProtoField(tag = 10)
    public final ItemThemeColor theme_color;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<ItemInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ApkDetail apk_detail;
        public String apk_name;
        public String brief;
        public String button_link;
        public Integer button_link_type;
        public String button_name;
        public String category1;
        public String category2;
        public ItemDetail detail;
        public String forum_name;
        public Double icon_size;
        public String icon_url;
        public Integer id;
        public Integer is_school;
        public String item_appid;
        public List<ItemOptions> item_options;
        public String name;
        public Ranking ranking;
        public ItemTable score;
        public ItemService service;
        public List<TagInfo> tag_info;
        public List<String> tags;
        public String template_name;
        public ItemThemeColor theme_color;

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
        public Builder(ItemInfo itemInfo) {
            super(itemInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {itemInfo};
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
            if (itemInfo == null) {
                return;
            }
            this.id = itemInfo.id;
            this.name = itemInfo.name;
            this.icon_url = itemInfo.icon_url;
            this.brief = itemInfo.brief;
            this.tags = Message.copyOf(itemInfo.tags);
            this.icon_size = itemInfo.icon_size;
            this.item_options = Message.copyOf(itemInfo.item_options);
            this.score = itemInfo.score;
            this.is_school = itemInfo.is_school;
            this.theme_color = itemInfo.theme_color;
            this.template_name = itemInfo.template_name;
            this.forum_name = itemInfo.forum_name;
            this.tag_info = Message.copyOf(itemInfo.tag_info);
            this.category1 = itemInfo.category1;
            this.category2 = itemInfo.category2;
            this.detail = itemInfo.detail;
            this.ranking = itemInfo.ranking;
            this.service = itemInfo.service;
            this.button_name = itemInfo.button_name;
            this.button_link = itemInfo.button_link;
            this.item_appid = itemInfo.item_appid;
            this.button_link_type = itemInfo.button_link_type;
            this.apk_name = itemInfo.apk_name;
            this.apk_detail = itemInfo.apk_detail;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ItemInfo(this, z, null) : (ItemInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2036664400, "Ltbclient/ItemInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2036664400, "Ltbclient/ItemInfo;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_TAGS = Collections.emptyList();
        DEFAULT_ICON_SIZE = Double.valueOf(0.0d);
        DEFAULT_ITEM_OPTIONS = Collections.emptyList();
        DEFAULT_IS_SCHOOL = 0;
        DEFAULT_TAG_INFO = Collections.emptyList();
        DEFAULT_BUTTON_LINK_TYPE = 0;
    }

    public /* synthetic */ ItemInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemInfo(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            String str3 = builder.brief;
            if (str3 == null) {
                this.brief = "";
            } else {
                this.brief = str3;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Double d2 = builder.icon_size;
            if (d2 == null) {
                this.icon_size = DEFAULT_ICON_SIZE;
            } else {
                this.icon_size = d2;
            }
            List<ItemOptions> list2 = builder.item_options;
            if (list2 == null) {
                this.item_options = DEFAULT_ITEM_OPTIONS;
            } else {
                this.item_options = Message.immutableCopyOf(list2);
            }
            this.score = builder.score;
            Integer num2 = builder.is_school;
            if (num2 == null) {
                this.is_school = DEFAULT_IS_SCHOOL;
            } else {
                this.is_school = num2;
            }
            this.theme_color = builder.theme_color;
            String str4 = builder.template_name;
            if (str4 == null) {
                this.template_name = "";
            } else {
                this.template_name = str4;
            }
            String str5 = builder.forum_name;
            if (str5 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str5;
            }
            List<TagInfo> list3 = builder.tag_info;
            if (list3 == null) {
                this.tag_info = DEFAULT_TAG_INFO;
            } else {
                this.tag_info = Message.immutableCopyOf(list3);
            }
            String str6 = builder.category1;
            if (str6 == null) {
                this.category1 = "";
            } else {
                this.category1 = str6;
            }
            String str7 = builder.category2;
            if (str7 == null) {
                this.category2 = "";
            } else {
                this.category2 = str7;
            }
            this.detail = builder.detail;
            this.ranking = builder.ranking;
            this.service = builder.service;
            String str8 = builder.button_name;
            if (str8 == null) {
                this.button_name = "";
            } else {
                this.button_name = str8;
            }
            String str9 = builder.button_link;
            if (str9 == null) {
                this.button_link = "";
            } else {
                this.button_link = str9;
            }
            String str10 = builder.item_appid;
            if (str10 == null) {
                this.item_appid = "";
            } else {
                this.item_appid = str10;
            }
            Integer num3 = builder.button_link_type;
            if (num3 == null) {
                this.button_link_type = DEFAULT_BUTTON_LINK_TYPE;
            } else {
                this.button_link_type = num3;
            }
            String str11 = builder.apk_name;
            if (str11 == null) {
                this.apk_name = "";
            } else {
                this.apk_name = str11;
            }
            this.apk_detail = builder.apk_detail;
            return;
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.brief = builder.brief;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.icon_size = builder.icon_size;
        this.item_options = Message.immutableCopyOf(builder.item_options);
        this.score = builder.score;
        this.is_school = builder.is_school;
        this.theme_color = builder.theme_color;
        this.template_name = builder.template_name;
        this.forum_name = builder.forum_name;
        this.tag_info = Message.immutableCopyOf(builder.tag_info);
        this.category1 = builder.category1;
        this.category2 = builder.category2;
        this.detail = builder.detail;
        this.ranking = builder.ranking;
        this.service = builder.service;
        this.button_name = builder.button_name;
        this.button_link = builder.button_link;
        this.item_appid = builder.item_appid;
        this.button_link_type = builder.button_link_type;
        this.apk_name = builder.apk_name;
        this.apk_detail = builder.apk_detail;
    }
}
