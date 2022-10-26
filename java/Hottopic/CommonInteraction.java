package tbclient.Hottopic;

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
/* loaded from: classes9.dex */
public final class CommonInteraction extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AFTER_CLICK_PIC = "";
    public static final String DEFAULT_BEFORE_CLICK_PIC = "";
    public static final Integer DEFAULT_HAS_CLICKED;
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Long DEFAULT_PK_ID;
    public static final String DEFAULT_QUES_DESC = "";
    public static final Long DEFAULT_TOTAL_NUM;
    public static final Long DEFAULT_USER_PK_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String after_click_pic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String before_click_pic;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_clicked;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ques_desc;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long total_num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long user_pk_id;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String after_click_pic;
        public String before_click_pic;
        public Integer has_clicked;
        public String module_name;
        public Long pk_id;
        public String ques_desc;
        public Long total_num;
        public Long user_pk_id;

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
        public Builder(CommonInteraction commonInteraction) {
            super(commonInteraction);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {commonInteraction};
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
            if (commonInteraction == null) {
                return;
            }
            this.module_name = commonInteraction.module_name;
            this.ques_desc = commonInteraction.ques_desc;
            this.total_num = commonInteraction.total_num;
            this.has_clicked = commonInteraction.has_clicked;
            this.before_click_pic = commonInteraction.before_click_pic;
            this.after_click_pic = commonInteraction.after_click_pic;
            this.pk_id = commonInteraction.pk_id;
            this.user_pk_id = commonInteraction.user_pk_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonInteraction build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new CommonInteraction(this, z, null);
            }
            return (CommonInteraction) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-143628009, "Ltbclient/Hottopic/CommonInteraction;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-143628009, "Ltbclient/Hottopic/CommonInteraction;");
                return;
            }
        }
        DEFAULT_TOTAL_NUM = 0L;
        DEFAULT_HAS_CLICKED = 0;
        DEFAULT_PK_ID = 0L;
        DEFAULT_USER_PK_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInteraction(Builder builder, boolean z) {
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
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.ques_desc;
            if (str2 == null) {
                this.ques_desc = "";
            } else {
                this.ques_desc = str2;
            }
            Long l = builder.total_num;
            if (l == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = l;
            }
            Integer num = builder.has_clicked;
            if (num == null) {
                this.has_clicked = DEFAULT_HAS_CLICKED;
            } else {
                this.has_clicked = num;
            }
            String str3 = builder.before_click_pic;
            if (str3 == null) {
                this.before_click_pic = "";
            } else {
                this.before_click_pic = str3;
            }
            String str4 = builder.after_click_pic;
            if (str4 == null) {
                this.after_click_pic = "";
            } else {
                this.after_click_pic = str4;
            }
            Long l2 = builder.pk_id;
            if (l2 == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l2;
            }
            Long l3 = builder.user_pk_id;
            if (l3 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l3;
                return;
            }
        }
        this.module_name = builder.module_name;
        this.ques_desc = builder.ques_desc;
        this.total_num = builder.total_num;
        this.has_clicked = builder.has_clicked;
        this.before_click_pic = builder.before_click_pic;
        this.after_click_pic = builder.after_click_pic;
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
    }

    public /* synthetic */ CommonInteraction(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
