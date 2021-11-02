package tbclient.PbPage;

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
public final class AddPost extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ALREADY_COUNT;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final String DEFAULT_LAST_ADDITION_CONTENT = "";
    public static final Integer DEFAULT_LAST_ADDITION_TIME;
    public static final String DEFAULT_POST_ID = "";
    public static final Integer DEFAULT_TOTAL_COUNT;
    public static final String DEFAULT_WARN_MSG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer already_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String last_addition_content;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer last_addition_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String post_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_count;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String warn_msg;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<AddPost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer already_count;
        public Integer create_time;
        public String last_addition_content;
        public Integer last_addition_time;
        public String post_id;
        public Integer total_count;
        public String warn_msg;

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
        public Builder(AddPost addPost) {
            super(addPost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {addPost};
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
            if (addPost == null) {
                return;
            }
            this.create_time = addPost.create_time;
            this.post_id = addPost.post_id;
            this.already_count = addPost.already_count;
            this.total_count = addPost.total_count;
            this.last_addition_content = addPost.last_addition_content;
            this.last_addition_time = addPost.last_addition_time;
            this.warn_msg = addPost.warn_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AddPost(this, z, null) : (AddPost) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-118246370, "Ltbclient/PbPage/AddPost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-118246370, "Ltbclient/PbPage/AddPost;");
                return;
            }
        }
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_ALREADY_COUNT = 0;
        DEFAULT_TOTAL_COUNT = 0;
        DEFAULT_LAST_ADDITION_TIME = 0;
    }

    public /* synthetic */ AddPost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPost(Builder builder, boolean z) {
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
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            String str = builder.post_id;
            if (str == null) {
                this.post_id = "";
            } else {
                this.post_id = str;
            }
            Integer num2 = builder.already_count;
            if (num2 == null) {
                this.already_count = DEFAULT_ALREADY_COUNT;
            } else {
                this.already_count = num2;
            }
            Integer num3 = builder.total_count;
            if (num3 == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = num3;
            }
            String str2 = builder.last_addition_content;
            if (str2 == null) {
                this.last_addition_content = "";
            } else {
                this.last_addition_content = str2;
            }
            Integer num4 = builder.last_addition_time;
            if (num4 == null) {
                this.last_addition_time = DEFAULT_LAST_ADDITION_TIME;
            } else {
                this.last_addition_time = num4;
            }
            String str3 = builder.warn_msg;
            if (str3 == null) {
                this.warn_msg = "";
                return;
            } else {
                this.warn_msg = str3;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.post_id = builder.post_id;
        this.already_count = builder.already_count;
        this.total_count = builder.total_count;
        this.last_addition_content = builder.last_addition_content;
        this.last_addition_time = builder.last_addition_time;
        this.warn_msg = builder.warn_msg;
    }
}
