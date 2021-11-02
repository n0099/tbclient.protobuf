package tbclient.GetVipInfo;

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
/* loaded from: classes3.dex */
public final class VipSpecialItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUTTON_TEXT_FINISH = "";
    public static final String DEFAULT_BUTTON_TEXT_INITIAL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DESC_EXT = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_IMG_URL = "";
    public static final Integer DEFAULT_IS_FINISH;
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_TASK_ID;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_UPDATE_TIME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String button_text_finish;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String button_text_initial;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String desc_ext;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer task_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String update_time;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<VipSpecialItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String button_text_finish;
        public String button_text_initial;
        public String desc;
        public String desc_ext;
        public Integer id;
        public String img_url;
        public Integer is_finish;
        public String link;
        public Integer task_id;
        public String title;
        public Integer type;
        public String update_time;

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
        public Builder(VipSpecialItem vipSpecialItem) {
            super(vipSpecialItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vipSpecialItem};
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
            if (vipSpecialItem == null) {
                return;
            }
            this.img_url = vipSpecialItem.img_url;
            this.title = vipSpecialItem.title;
            this.desc = vipSpecialItem.desc;
            this.link = vipSpecialItem.link;
            this.update_time = vipSpecialItem.update_time;
            this.id = vipSpecialItem.id;
            this.type = vipSpecialItem.type;
            this.desc_ext = vipSpecialItem.desc_ext;
            this.task_id = vipSpecialItem.task_id;
            this.is_finish = vipSpecialItem.is_finish;
            this.button_text_initial = vipSpecialItem.button_text_initial;
            this.button_text_finish = vipSpecialItem.button_text_finish;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpecialItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VipSpecialItem(this, z, null) : (VipSpecialItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1645048700, "Ltbclient/GetVipInfo/VipSpecialItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1645048700, "Ltbclient/GetVipInfo/VipSpecialItem;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_TASK_ID = 0;
        DEFAULT_IS_FINISH = 0;
    }

    public /* synthetic */ VipSpecialItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipSpecialItem(Builder builder, boolean z) {
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
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            String str4 = builder.link;
            if (str4 == null) {
                this.link = "";
            } else {
                this.link = str4;
            }
            String str5 = builder.update_time;
            if (str5 == null) {
                this.update_time = "";
            } else {
                this.update_time = str5;
            }
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str6 = builder.desc_ext;
            if (str6 == null) {
                this.desc_ext = "";
            } else {
                this.desc_ext = str6;
            }
            Integer num3 = builder.task_id;
            if (num3 == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = num3;
            }
            Integer num4 = builder.is_finish;
            if (num4 == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num4;
            }
            String str7 = builder.button_text_initial;
            if (str7 == null) {
                this.button_text_initial = "";
            } else {
                this.button_text_initial = str7;
            }
            String str8 = builder.button_text_finish;
            if (str8 == null) {
                this.button_text_finish = "";
                return;
            } else {
                this.button_text_finish = str8;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.title = builder.title;
        this.desc = builder.desc;
        this.link = builder.link;
        this.update_time = builder.update_time;
        this.id = builder.id;
        this.type = builder.type;
        this.desc_ext = builder.desc_ext;
        this.task_id = builder.task_id;
        this.is_finish = builder.is_finish;
        this.button_text_initial = builder.button_text_initial;
        this.button_text_finish = builder.button_text_finish;
    }
}
