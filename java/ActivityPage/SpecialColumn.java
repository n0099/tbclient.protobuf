package tbclient.ActivityPage;

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
public final class SpecialColumn extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AGREE_NUM;
    public static final Integer DEFAULT_FREQ_NUM;
    public static final String DEFAULT_IMAGE = "";
    public static final Long DEFAULT_LIVE_ID;
    public static final String DEFAULT_TEXT = "";
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer freq_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long live_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SpecialColumn> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer agree_num;
        public Integer freq_num;
        public String image;
        public Long live_id;
        public String text;
        public Long thread_id;
        public String title;
        public Integer type;

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
        public Builder(SpecialColumn specialColumn) {
            super(specialColumn);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {specialColumn};
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
            if (specialColumn == null) {
                return;
            }
            this.type = specialColumn.type;
            this.thread_id = specialColumn.thread_id;
            this.live_id = specialColumn.live_id;
            this.title = specialColumn.title;
            this.image = specialColumn.image;
            this.text = specialColumn.text;
            this.freq_num = specialColumn.freq_num;
            this.agree_num = specialColumn.agree_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpecialColumn build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SpecialColumn(this, z, null) : (SpecialColumn) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1155194477, "Ltbclient/ActivityPage/SpecialColumn;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1155194477, "Ltbclient/ActivityPage/SpecialColumn;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_LIVE_ID = 0L;
        DEFAULT_FREQ_NUM = 0;
        DEFAULT_AGREE_NUM = 0;
    }

    public /* synthetic */ SpecialColumn(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialColumn(Builder builder, boolean z) {
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
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.live_id;
            if (l2 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.image;
            if (str2 == null) {
                this.image = "";
            } else {
                this.image = str2;
            }
            String str3 = builder.text;
            if (str3 == null) {
                this.text = "";
            } else {
                this.text = str3;
            }
            Integer num2 = builder.freq_num;
            if (num2 == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = num2;
            }
            Integer num3 = builder.agree_num;
            if (num3 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
                return;
            } else {
                this.agree_num = num3;
                return;
            }
        }
        this.type = builder.type;
        this.thread_id = builder.thread_id;
        this.live_id = builder.live_id;
        this.title = builder.title;
        this.image = builder.image;
        this.text = builder.text;
        this.freq_num = builder.freq_num;
        this.agree_num = builder.agree_num;
    }
}
