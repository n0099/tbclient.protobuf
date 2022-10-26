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
public final class ActivityHead extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_TITLE = "";
    public static final Integer DEFAULT_ACTIVITY_TYPE;
    public static final List<HeadImgs> DEFAULT_HEAD_IMGS;
    public static final Boolean DEFAULT_IS_AD;
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_PULL_DOWN_CLICK_URL = "";
    public static final String DEFAULT_PULL_DOWN_EXPOSURE_URL = "";
    public static final Integer DEFAULT_PULL_DOWN_INTERVAL;
    public static final String DEFAULT_PULL_DOWN_PACKAGE_NAME = "";
    public static final String DEFAULT_PULL_DOWN_PIC_ANDROID = "";
    public static final String DEFAULT_PULL_DOWN_PIC_IOS = "";
    public static final String DEFAULT_PULL_DOWN_SCHEMA = "";
    public static final String DEFAULT_PULL_DOWN_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String activity_title;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<HeadImgs> head_imgs;
    @ProtoField(tag = 13, type = Message.Datatype.BOOL)
    public final Boolean is_ad;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String pull_down_click_url;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String pull_down_exposure_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer pull_down_interval;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String pull_down_package_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String pull_down_pic_android;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String pull_down_pic_ios;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String pull_down_schema;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String pull_down_url;
    @ProtoField(tag = 4)
    public final Size top_size;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_title;
        public Integer activity_type;
        public List head_imgs;
        public Boolean is_ad;
        public String obj_id;
        public String pull_down_click_url;
        public String pull_down_exposure_url;
        public Integer pull_down_interval;
        public String pull_down_package_name;
        public String pull_down_pic_android;
        public String pull_down_pic_ios;
        public String pull_down_schema;
        public String pull_down_url;
        public Size top_size;

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
        public Builder(ActivityHead activityHead) {
            super(activityHead);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {activityHead};
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
            if (activityHead == null) {
                return;
            }
            this.activity_type = activityHead.activity_type;
            this.activity_title = activityHead.activity_title;
            this.head_imgs = Message.copyOf(activityHead.head_imgs);
            this.top_size = activityHead.top_size;
            this.obj_id = activityHead.obj_id;
            this.pull_down_url = activityHead.pull_down_url;
            this.pull_down_interval = activityHead.pull_down_interval;
            this.pull_down_pic_ios = activityHead.pull_down_pic_ios;
            this.pull_down_pic_android = activityHead.pull_down_pic_android;
            this.pull_down_exposure_url = activityHead.pull_down_exposure_url;
            this.pull_down_click_url = activityHead.pull_down_click_url;
            this.is_ad = activityHead.is_ad;
            this.pull_down_schema = activityHead.pull_down_schema;
            this.pull_down_package_name = activityHead.pull_down_package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityHead build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ActivityHead(this, z, null);
            }
            return (ActivityHead) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1127712823, "Ltbclient/FrsPage/ActivityHead;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1127712823, "Ltbclient/FrsPage/ActivityHead;");
                return;
            }
        }
        DEFAULT_ACTIVITY_TYPE = 0;
        DEFAULT_HEAD_IMGS = Collections.emptyList();
        DEFAULT_PULL_DOWN_INTERVAL = 0;
        DEFAULT_IS_AD = Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHead(Builder builder, boolean z) {
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
            Integer num = builder.activity_type;
            if (num == null) {
                this.activity_type = DEFAULT_ACTIVITY_TYPE;
            } else {
                this.activity_type = num;
            }
            String str = builder.activity_title;
            if (str == null) {
                this.activity_title = "";
            } else {
                this.activity_title = str;
            }
            List list = builder.head_imgs;
            if (list == null) {
                this.head_imgs = DEFAULT_HEAD_IMGS;
            } else {
                this.head_imgs = Message.immutableCopyOf(list);
            }
            this.top_size = builder.top_size;
            String str2 = builder.obj_id;
            if (str2 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str2;
            }
            String str3 = builder.pull_down_url;
            if (str3 == null) {
                this.pull_down_url = "";
            } else {
                this.pull_down_url = str3;
            }
            Integer num2 = builder.pull_down_interval;
            if (num2 == null) {
                this.pull_down_interval = DEFAULT_PULL_DOWN_INTERVAL;
            } else {
                this.pull_down_interval = num2;
            }
            String str4 = builder.pull_down_pic_ios;
            if (str4 == null) {
                this.pull_down_pic_ios = "";
            } else {
                this.pull_down_pic_ios = str4;
            }
            String str5 = builder.pull_down_pic_android;
            if (str5 == null) {
                this.pull_down_pic_android = "";
            } else {
                this.pull_down_pic_android = str5;
            }
            String str6 = builder.pull_down_exposure_url;
            if (str6 == null) {
                this.pull_down_exposure_url = "";
            } else {
                this.pull_down_exposure_url = str6;
            }
            String str7 = builder.pull_down_click_url;
            if (str7 == null) {
                this.pull_down_click_url = "";
            } else {
                this.pull_down_click_url = str7;
            }
            Boolean bool = builder.is_ad;
            if (bool == null) {
                this.is_ad = DEFAULT_IS_AD;
            } else {
                this.is_ad = bool;
            }
            String str8 = builder.pull_down_schema;
            if (str8 == null) {
                this.pull_down_schema = "";
            } else {
                this.pull_down_schema = str8;
            }
            String str9 = builder.pull_down_package_name;
            if (str9 == null) {
                this.pull_down_package_name = "";
                return;
            } else {
                this.pull_down_package_name = str9;
                return;
            }
        }
        this.activity_type = builder.activity_type;
        this.activity_title = builder.activity_title;
        this.head_imgs = Message.immutableCopyOf(builder.head_imgs);
        this.top_size = builder.top_size;
        this.obj_id = builder.obj_id;
        this.pull_down_url = builder.pull_down_url;
        this.pull_down_interval = builder.pull_down_interval;
        this.pull_down_pic_ios = builder.pull_down_pic_ios;
        this.pull_down_pic_android = builder.pull_down_pic_android;
        this.pull_down_exposure_url = builder.pull_down_exposure_url;
        this.pull_down_click_url = builder.pull_down_click_url;
        this.is_ad = builder.is_ad;
        this.pull_down_schema = builder.pull_down_schema;
        this.pull_down_package_name = builder.pull_down_package_name;
    }

    public /* synthetic */ ActivityHead(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
