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
/* loaded from: classes9.dex */
public final class NovelInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AUTHOR = "";
    public static final Long DEFAULT_CHAPTERS;
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DISCOUNT_PRICE = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_IS_PAY = "";
    public static final String DEFAULT_NAME = "";
    public static final Long DEFAULT_NOVEL_ID;
    public static final Long DEFAULT_PERCENT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long chapters;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String discount_price;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String h5_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String is_pay;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long novel_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long percent;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NovelInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String author;
        public Long chapters;
        public String desc;
        public String discount_price;
        public String h5_url;
        public String img;
        public String is_pay;
        public String name;
        public Long novel_id;
        public Long percent;

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
        public Builder(NovelInfo novelInfo) {
            super(novelInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {novelInfo};
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
            if (novelInfo == null) {
                return;
            }
            this.novel_id = novelInfo.novel_id;
            this.img = novelInfo.img;
            this.name = novelInfo.name;
            this.author = novelInfo.author;
            this.desc = novelInfo.desc;
            this.discount_price = novelInfo.discount_price;
            this.percent = novelInfo.percent;
            this.h5_url = novelInfo.h5_url;
            this.is_pay = novelInfo.is_pay;
            this.chapters = novelInfo.chapters;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NovelInfo(this, z, null) : (NovelInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(197848283, "Ltbclient/NovelInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(197848283, "Ltbclient/NovelInfo;");
                return;
            }
        }
        DEFAULT_NOVEL_ID = 0L;
        DEFAULT_PERCENT = 0L;
        DEFAULT_CHAPTERS = 0L;
    }

    public /* synthetic */ NovelInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NovelInfo(Builder builder, boolean z) {
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
            Long l = builder.novel_id;
            if (l == null) {
                this.novel_id = DEFAULT_NOVEL_ID;
            } else {
                this.novel_id = l;
            }
            String str = builder.img;
            if (str == null) {
                this.img = "";
            } else {
                this.img = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.author;
            if (str3 == null) {
                this.author = "";
            } else {
                this.author = str3;
            }
            String str4 = builder.desc;
            if (str4 == null) {
                this.desc = "";
            } else {
                this.desc = str4;
            }
            String str5 = builder.discount_price;
            if (str5 == null) {
                this.discount_price = "";
            } else {
                this.discount_price = str5;
            }
            Long l2 = builder.percent;
            if (l2 == null) {
                this.percent = DEFAULT_PERCENT;
            } else {
                this.percent = l2;
            }
            String str6 = builder.h5_url;
            if (str6 == null) {
                this.h5_url = "";
            } else {
                this.h5_url = str6;
            }
            String str7 = builder.is_pay;
            if (str7 == null) {
                this.is_pay = "";
            } else {
                this.is_pay = str7;
            }
            Long l3 = builder.chapters;
            if (l3 == null) {
                this.chapters = DEFAULT_CHAPTERS;
                return;
            } else {
                this.chapters = l3;
                return;
            }
        }
        this.novel_id = builder.novel_id;
        this.img = builder.img;
        this.name = builder.name;
        this.author = builder.author;
        this.desc = builder.desc;
        this.discount_price = builder.discount_price;
        this.percent = builder.percent;
        this.h5_url = builder.h5_url;
        this.is_pay = builder.is_pay;
        this.chapters = builder.chapters;
    }
}
