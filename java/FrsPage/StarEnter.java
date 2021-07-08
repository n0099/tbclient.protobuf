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
/* loaded from: classes9.dex */
public final class StarEnter extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BAZHU_MARK;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final Integer DEFAULT_RANK_NUM;
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TIME;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_URL = "";
    public static final Integer DEFAULT_WEIGHT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer bazhu_mark;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer rank_num;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer weight;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StarEnter> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer bazhu_mark;
        public String icon;
        public String obj_id;
        public Integer rank_num;
        public String text;
        public Integer time;
        public String title;
        public Integer type;
        public String url;
        public Integer weight;

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
        public Builder(StarEnter starEnter) {
            super(starEnter);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {starEnter};
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
            if (starEnter == null) {
                return;
            }
            this.icon = starEnter.icon;
            this.title = starEnter.title;
            this.weight = starEnter.weight;
            this.type = starEnter.type;
            this.url = starEnter.url;
            this.time = starEnter.time;
            this.obj_id = starEnter.obj_id;
            this.text = starEnter.text;
            this.rank_num = starEnter.rank_num;
            this.bazhu_mark = starEnter.bazhu_mark;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarEnter build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new StarEnter(this, z, null) : (StarEnter) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(115636024, "Ltbclient/FrsPage/StarEnter;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(115636024, "Ltbclient/FrsPage/StarEnter;");
                return;
            }
        }
        DEFAULT_WEIGHT = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_TIME = 0;
        DEFAULT_RANK_NUM = 0;
        DEFAULT_BAZHU_MARK = 0;
    }

    public /* synthetic */ StarEnter(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarEnter(Builder builder, boolean z) {
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
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Integer num = builder.weight;
            if (num == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            Integer num3 = builder.time;
            if (num3 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num3;
            }
            String str4 = builder.obj_id;
            if (str4 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str4;
            }
            String str5 = builder.text;
            if (str5 == null) {
                this.text = "";
            } else {
                this.text = str5;
            }
            Integer num4 = builder.rank_num;
            if (num4 == null) {
                this.rank_num = DEFAULT_RANK_NUM;
            } else {
                this.rank_num = num4;
            }
            Integer num5 = builder.bazhu_mark;
            if (num5 == null) {
                this.bazhu_mark = DEFAULT_BAZHU_MARK;
                return;
            } else {
                this.bazhu_mark = num5;
                return;
            }
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.weight = builder.weight;
        this.type = builder.type;
        this.url = builder.url;
        this.time = builder.time;
        this.obj_id = builder.obj_id;
        this.text = builder.text;
        this.rank_num = builder.rank_num;
        this.bazhu_mark = builder.bazhu_mark;
    }
}
