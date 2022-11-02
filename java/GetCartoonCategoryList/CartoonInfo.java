package tbclient.GetCartoonCategoryList;

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
public final class CartoonInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CARTOON_ID;
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_INTRODUCTION = "";
    public static final Integer DEFAULT_IS_FINISH;
    public static final Integer DEFAULT_TOTAL_CHAPTER;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String introduction;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_finish;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer total_chapter;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CartoonInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;
        public Long forum_id;
        public String introduction;
        public Integer is_finish;
        public Integer total_chapter;

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
        public Builder(CartoonInfo cartoonInfo) {
            super(cartoonInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {cartoonInfo};
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
            if (cartoonInfo == null) {
                return;
            }
            this.forum_id = cartoonInfo.forum_id;
            this.cartoon_id = cartoonInfo.cartoon_id;
            this.cartoon_name = cartoonInfo.cartoon_name;
            this.introduction = cartoonInfo.introduction;
            this.is_finish = cartoonInfo.is_finish;
            this.cover_img = cartoonInfo.cover_img;
            this.total_chapter = cartoonInfo.total_chapter;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new CartoonInfo(this, z, null);
            }
            return (CartoonInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1955249552, "Ltbclient/GetCartoonCategoryList/CartoonInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1955249552, "Ltbclient/GetCartoonCategoryList/CartoonInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_CARTOON_ID = 0L;
        DEFAULT_IS_FINISH = 0;
        DEFAULT_TOTAL_CHAPTER = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartoonInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.cartoon_id;
            if (l2 == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l2;
            }
            String str = builder.cartoon_name;
            if (str == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str;
            }
            String str2 = builder.introduction;
            if (str2 == null) {
                this.introduction = "";
            } else {
                this.introduction = str2;
            }
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            String str3 = builder.cover_img;
            if (str3 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str3;
            }
            Integer num2 = builder.total_chapter;
            if (num2 == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
                return;
            } else {
                this.total_chapter = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.introduction = builder.introduction;
        this.is_finish = builder.is_finish;
        this.cover_img = builder.cover_img;
        this.total_chapter = builder.total_chapter;
    }

    public /* synthetic */ CartoonInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
