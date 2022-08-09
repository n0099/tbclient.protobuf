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
public final class TwAnchorPKItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FANS_NUM = "";
    public static final String DEFAULT_HEAD_URL = "";
    public static final String DEFAULT_ORDER = "";
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_USER_SEX;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fans_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String head_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String order;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer user_sex;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TwAnchorPKItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String fans_num;
        public String head_url;
        public String order;
        public Long user_id;
        public String user_name;
        public Integer user_sex;

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
        public Builder(TwAnchorPKItem twAnchorPKItem) {
            super(twAnchorPKItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twAnchorPKItem};
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
            if (twAnchorPKItem == null) {
                return;
            }
            this.order = twAnchorPKItem.order;
            this.user_id = twAnchorPKItem.user_id;
            this.head_url = twAnchorPKItem.head_url;
            this.user_name = twAnchorPKItem.user_name;
            this.fans_num = twAnchorPKItem.fans_num;
            this.user_sex = twAnchorPKItem.user_sex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorPKItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwAnchorPKItem(this, z, null) : (TwAnchorPKItem) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2124190197, "Ltbclient/TwAnchorPKItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2124190197, "Ltbclient/TwAnchorPKItem;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_USER_SEX = 0;
    }

    public /* synthetic */ TwAnchorPKItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwAnchorPKItem(Builder builder, boolean z) {
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
            String str = builder.order;
            if (str == null) {
                this.order = "";
            } else {
                this.order = str;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str2 = builder.head_url;
            if (str2 == null) {
                this.head_url = "";
            } else {
                this.head_url = str2;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            String str4 = builder.fans_num;
            if (str4 == null) {
                this.fans_num = "";
            } else {
                this.fans_num = str4;
            }
            Integer num = builder.user_sex;
            if (num == null) {
                this.user_sex = DEFAULT_USER_SEX;
                return;
            } else {
                this.user_sex = num;
                return;
            }
        }
        this.order = builder.order;
        this.user_id = builder.user_id;
        this.head_url = builder.head_url;
        this.user_name = builder.user_name;
        this.fans_num = builder.fans_num;
        this.user_sex = builder.user_sex;
    }
}
