package tbclient.Loop;

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
public final class ChatroomFrsRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<Long> DEFAULT_HOT_LIST;
    public static final List<ChatroomList> DEFAULT_ROOM_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.INT64)
    public final List<Long> hot_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ChatroomList> room_list;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomFrsRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Long> hot_list;
        public List<ChatroomList> room_list;

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
        public Builder(ChatroomFrsRes chatroomFrsRes) {
            super(chatroomFrsRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {chatroomFrsRes};
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
            if (chatroomFrsRes == null) {
                return;
            }
            this.hot_list = Message.copyOf(chatroomFrsRes.hot_list);
            this.room_list = Message.copyOf(chatroomFrsRes.room_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomFrsRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ChatroomFrsRes(this, z, null);
            }
            return (ChatroomFrsRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-653048818, "Ltbclient/Loop/ChatroomFrsRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-653048818, "Ltbclient/Loop/ChatroomFrsRes;");
                return;
            }
        }
        DEFAULT_HOT_LIST = Collections.emptyList();
        DEFAULT_ROOM_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatroomFrsRes(Builder builder, boolean z) {
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
            List<Long> list = builder.hot_list;
            if (list == null) {
                this.hot_list = DEFAULT_HOT_LIST;
            } else {
                this.hot_list = Message.immutableCopyOf(list);
            }
            List<ChatroomList> list2 = builder.room_list;
            if (list2 == null) {
                this.room_list = DEFAULT_ROOM_LIST;
                return;
            } else {
                this.room_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.hot_list = Message.immutableCopyOf(builder.hot_list);
        this.room_list = Message.immutableCopyOf(builder.room_list);
    }

    public /* synthetic */ ChatroomFrsRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
