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
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class AddPostList extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<SubPostList> DEFAULT_ADD_POST_LIST;
    public static final Long DEFAULT_PID;
    public static final Integer DEFAULT_TOTAL_COUNT;
    public static final Integer DEFAULT_TOTAL_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SubPostList> add_post_list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer total_count;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer total_num;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AddPostList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<SubPostList> add_post_list;
        public Long pid;
        public Integer total_count;
        public Integer total_num;

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
        public Builder(AddPostList addPostList) {
            super(addPostList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {addPostList};
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
            if (addPostList == null) {
                return;
            }
            this.pid = addPostList.pid;
            this.total_num = addPostList.total_num;
            this.total_count = addPostList.total_count;
            this.add_post_list = Message.copyOf(addPostList.add_post_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPostList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AddPostList(this, z, null) : (AddPostList) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(307827942, "Ltbclient/AddPostList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(307827942, "Ltbclient/AddPostList;");
                return;
            }
        }
        DEFAULT_PID = 0L;
        DEFAULT_TOTAL_NUM = 0;
        DEFAULT_TOTAL_COUNT = 0;
        DEFAULT_ADD_POST_LIST = Collections.emptyList();
    }

    public /* synthetic */ AddPostList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPostList(Builder builder, boolean z) {
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
            Long l = builder.pid;
            if (l == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l;
            }
            Integer num = builder.total_num;
            if (num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = num;
            }
            Integer num2 = builder.total_count;
            if (num2 == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = num2;
            }
            List<SubPostList> list = builder.add_post_list;
            if (list == null) {
                this.add_post_list = DEFAULT_ADD_POST_LIST;
                return;
            } else {
                this.add_post_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.pid = builder.pid;
        this.total_num = builder.total_num;
        this.total_count = builder.total_count;
        this.add_post_list = Message.immutableCopyOf(builder.add_post_list);
    }
}
