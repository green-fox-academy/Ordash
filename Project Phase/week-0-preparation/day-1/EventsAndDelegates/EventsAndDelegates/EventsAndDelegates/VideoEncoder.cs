using System;
using System.Threading;

namespace EventsAndDelegates
{
    public class VideoEncoder
    {
        // We want to implment an event such that when the encoding is finished 
        // it notifies anyone who was intrested in that event

        // 1 - Define a delegate (this is the agreement between the publisher and the subsciber
        //                        the delegate determines the signature of the method)
        // 2 - Define an event based on the delegate
        // 3 - Raise the event


        public delegate void VideoEncodedEventHandler(object source, EventArgs args);
        public event VideoEncodedEventHandler VideoEncoded;
        public void Encode(Video video)
        {
            Console.WriteLine("Encoding Video...");
            Thread.Sleep(3000);

            OnVideoEncoded();
        }

        protected virtual void OnVideoEncoded()
        {
            if (VideoEncoded != null)
                VideoEncoded(this, EventArgs.Empty);
            
       
        }
    }
}
