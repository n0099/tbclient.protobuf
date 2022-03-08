package tbclient.TalkBall;

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
public final class InsertFloor extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final List<VideoCard> DEFAULT_WANDER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<VideoCard> wander_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<InsertFloor> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer topic_id;
        public String topic_name;
        public List<VideoCard> wander_list;

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
        public Builder(InsertFloor insertFloor) {
            super(insertFloor);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {insertFloor};
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
            if (insertFloor == null) {
                return;
            }
            this.topic_id = insertFloor.topic_id;
            this.topic_name = insertFloor.topic_name;
            this.wander_list = Message.copyOf(insertFloor.wander_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public InsertFloor build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new InsertFloor(this, z, null) : (InsertFloor) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1502988802, "Ltbclient/TalkBall/InsertFloor;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1502988802, "Ltbclient/TalkBall/InsertFloor;");
                return;
            }
        }
        DEFAULT_TOPIC_ID = 0;
        DEFAULT_WANDER_LIST = Collections.emptyList();
    }

    public /* synthetic */ InsertFloor(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertFloor(Builder builder, boolean z) {
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
            Integer num = builder.topic_id;
            if (num == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = num;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            List<VideoCard> list = builder.wander_list;
            if (list == null) {
                this.wander_list = DEFAULT_WANDER_LIST;
                return;
            } else {
                this.wander_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.wander_list = Message.immutableCopyOf(builder.wander_list);
    }
}
