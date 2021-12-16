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
/* loaded from: classes4.dex */
public final class ActPost extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ActHot> DEFAULT_ACT_HOT;
    public static final List<LinkInfo> DEFAULT_LINK_INFO;
    public static final String DEFAULT_LIST_HEAD = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ActHot> act_hot;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LinkInfo> link_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String list_head;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ActPost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ActHot> act_hot;
        public List<LinkInfo> link_info;
        public String list_head;

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
        public Builder(ActPost actPost) {
            super(actPost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {actPost};
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
            if (actPost == null) {
                return;
            }
            this.act_hot = Message.copyOf(actPost.act_hot);
            this.list_head = actPost.list_head;
            this.link_info = Message.copyOf(actPost.link_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActPost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ActPost(this, z, null) : (ActPost) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1405276909, "Ltbclient/ActPost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1405276909, "Ltbclient/ActPost;");
                return;
            }
        }
        DEFAULT_ACT_HOT = Collections.emptyList();
        DEFAULT_LINK_INFO = Collections.emptyList();
    }

    public /* synthetic */ ActPost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActPost(Builder builder, boolean z) {
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
            List<ActHot> list = builder.act_hot;
            if (list == null) {
                this.act_hot = DEFAULT_ACT_HOT;
            } else {
                this.act_hot = Message.immutableCopyOf(list);
            }
            String str = builder.list_head;
            if (str == null) {
                this.list_head = "";
            } else {
                this.list_head = str;
            }
            List<LinkInfo> list2 = builder.link_info;
            if (list2 == null) {
                this.link_info = DEFAULT_LINK_INFO;
                return;
            } else {
                this.link_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.act_hot = Message.immutableCopyOf(builder.act_hot);
        this.list_head = builder.list_head;
        this.link_info = Message.immutableCopyOf(builder.link_info);
    }
}
