package tbclient.FrsPage;

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
public final class HeadImgs extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_TEXT = "";
    public static final Integer DEFAULT_HAS_SECOND_PAGE;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_PC_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer has_second_page;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pc_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HeadImgs> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String btn_text;
        public Integer has_second_page;
        public String img_url;
        public String pc_url;
        public String schema;
        public String subtitle;
        public String tag_name_url;
        public String tag_name_wh;
        public List<String> third_statistics_url;
        public String title;

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
        public Builder(HeadImgs headImgs) {
            super(headImgs);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {headImgs};
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
            if (headImgs == null) {
                return;
            }
            this.img_url = headImgs.img_url;
            this.pc_url = headImgs.pc_url;
            this.title = headImgs.title;
            this.subtitle = headImgs.subtitle;
            this.btn_text = headImgs.btn_text;
            this.tag_name_url = headImgs.tag_name_url;
            this.tag_name_wh = headImgs.tag_name_wh;
            this.schema = headImgs.schema;
            this.third_statistics_url = Message.copyOf(headImgs.third_statistics_url);
            this.has_second_page = headImgs.has_second_page;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadImgs build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HeadImgs(this, z, null) : (HeadImgs) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(412332264, "Ltbclient/FrsPage/HeadImgs;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(412332264, "Ltbclient/FrsPage/HeadImgs;");
                return;
            }
        }
        DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
        DEFAULT_HAS_SECOND_PAGE = 0;
    }

    public /* synthetic */ HeadImgs(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadImgs(Builder builder, boolean z) {
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
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.pc_url;
            if (str2 == null) {
                this.pc_url = "";
            } else {
                this.pc_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.subtitle;
            if (str4 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str4;
            }
            String str5 = builder.btn_text;
            if (str5 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str5;
            }
            String str6 = builder.tag_name_url;
            if (str6 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str6;
            }
            String str7 = builder.tag_name_wh;
            if (str7 == null) {
                this.tag_name_wh = "";
            } else {
                this.tag_name_wh = str7;
            }
            String str8 = builder.schema;
            if (str8 == null) {
                this.schema = "";
            } else {
                this.schema = str8;
            }
            List<String> list = builder.third_statistics_url;
            if (list == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_second_page;
            if (num == null) {
                this.has_second_page = DEFAULT_HAS_SECOND_PAGE;
                return;
            } else {
                this.has_second_page = num;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.pc_url = builder.pc_url;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.btn_text = builder.btn_text;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
        this.has_second_page = builder.has_second_page;
    }
}
