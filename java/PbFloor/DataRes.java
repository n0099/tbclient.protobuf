package tbclient.PbFloor;

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
import tbclient.Anti;
import tbclient.Page;
import tbclient.Post;
import tbclient.SimpleForum;
import tbclient.SubPostList;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_BLACK_WHITE;
    public static final Integer DEFAULT_SERVER_TIME;
    public static final List<SubPostList> DEFAULT_SUBPOST_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2)
    public final Anti anti;
    @ProtoField(tag = 8)
    public final SimpleForum display_forum;
    @ProtoField(tag = 6)
    public final SimpleForum forum;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_black_white;
    @ProtoField(tag = 1)
    public final Page page;
    @ProtoField(tag = 3)
    public final Post post;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<SubPostList> subpost_list;
    @ProtoField(tag = 5)
    public final ThreadInfo thread;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Anti anti;
        public SimpleForum display_forum;
        public SimpleForum forum;
        public Integer is_black_white;
        public Page page;
        public Post post;
        public Integer server_time;
        public List<SubPostList> subpost_list;
        public ThreadInfo thread;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.page = dataRes.page;
            this.anti = dataRes.anti;
            this.post = dataRes.post;
            this.subpost_list = Message.copyOf(dataRes.subpost_list);
            this.thread = dataRes.thread;
            this.forum = dataRes.forum;
            this.server_time = dataRes.server_time;
            this.display_forum = dataRes.display_forum;
            this.is_black_white = dataRes.is_black_white;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-987703132, "Ltbclient/PbFloor/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-987703132, "Ltbclient/PbFloor/DataRes;");
                return;
            }
        }
        DEFAULT_SUBPOST_LIST = Collections.emptyList();
        DEFAULT_SERVER_TIME = 0;
        DEFAULT_IS_BLACK_WHITE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            this.page = builder.page;
            this.anti = builder.anti;
            this.post = builder.post;
            List<SubPostList> list = builder.subpost_list;
            if (list == null) {
                this.subpost_list = DEFAULT_SUBPOST_LIST;
            } else {
                this.subpost_list = Message.immutableCopyOf(list);
            }
            this.thread = builder.thread;
            this.forum = builder.forum;
            Integer num = builder.server_time;
            if (num == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = num;
            }
            this.display_forum = builder.display_forum;
            Integer num2 = builder.is_black_white;
            if (num2 == null) {
                this.is_black_white = DEFAULT_IS_BLACK_WHITE;
                return;
            } else {
                this.is_black_white = num2;
                return;
            }
        }
        this.page = builder.page;
        this.anti = builder.anti;
        this.post = builder.post;
        this.subpost_list = Message.immutableCopyOf(builder.subpost_list);
        this.thread = builder.thread;
        this.forum = builder.forum;
        this.server_time = builder.server_time;
        this.display_forum = builder.display_forum;
        this.is_black_white = builder.is_black_white;
    }
}
